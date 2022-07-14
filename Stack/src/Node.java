public class Node <Type> {
    
    private Type value;
    private Node<Type> nodePrevious;

   public Node(Type value){
       this.value = value;
   }

   public Type getValue() {
       return value;
   }
   public void setValue(Type value) {
       this.value = value;
   }

   public Node<Type> getNodePrevious() {
       return nodePrevious;
   }
   public void setNodePrevious(Node<Type> nodePrevious) {
       this.nodePrevious = nodePrevious;
   }

   @Override
   public String toString(){
       return "No {"+
              "dado="+ value +
              '}';
   }
}
