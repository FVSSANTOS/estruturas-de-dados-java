package BST;
public class BinarySearchTree<Type extends Comparable> {
   
    private  Node<Type> root;

   public BinarySearchTree(){
      this.root = null;
   }

   public Node<Type> getRoot(){
     return this.root;
   }
   public void add(Type value){  
      if(root == null){
         this.root  =  new Node<Type>(value);
         return;
      }
       add(value,root);
   }

   private void add(Type value,Node<Type> root){

      if(value.compareTo(root.getValue())<0){
         if(root.getNodeLeft() == null){
            root.setNodeLeft(new Node<Type>(value));
         }else{
            add(value,root.getNodeLeft());
         }
      }

      if(value.compareTo(root.getValue())>0){
         if(root.getNodeRight() == null){
            root.setNodeRight(new Node<Type>(value));
         }else{
            add(value,root.getNodeRight());
         }
      }
   }

   public Node search(Type value, Node<Type> root){
      if(this.root != null){
         if(value.compareTo(root.getValue()) == 0){
            return root;
          }
          else{
             if(value.compareTo(root.getValue())<0){
                return search(value, root.getNodeLeft());
             }else{
                return search(value, root.getNodeRight());
             }
      }
   }
   return null;
}

   public void delete(Type value){
     if(value.compareTo(root.getValue()) == 0){
        if(root.getNodeLeft() == null && root.getNodeRight() == null){
           root = null;
        }else if(root.getNodeLeft() == null){
           root = root.getNodeRight();
        }else if(root.getNodeRight() == null){
           root = root.getNodeLeft();
        }else{
           
         Node<Type> current = root.getNodeRight();
         while(current.getNodeLeft() != null){
             current = current.getNodeLeft();
         }
          current.setNodeLeft(root.getNodeLeft());
          this.root = root.getNodeRight();
        }
     }else{
        Node<Type> current = search(value,root);
        if(current != null){
           Node<Type> currentC = current;
           while(currentC.getNodeRight() != null){
              currentC = currentC.getNodeRight();
           }
           current = currentC;
           currentC.setValue(null);
           }
         }
      }
     
}
