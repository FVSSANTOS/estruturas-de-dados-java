public class Queue<Type> {

    private Node<Type> inputNode;
    
    public Queue(){
        this.inputNode = null;
    }

    public boolean isEmpty(){
        return inputNode == null ? true : false;
    }
    
    public void enqueue(Type value){
       Node<Type> newNode = new Node<Type>(value);
       newNode.setNext(inputNode);
       inputNode = newNode;
        }

    public Type first(){
        if(!this.isEmpty()){
          Node<Type> currentNode = inputNode;
          while(true){
              if(currentNode.getNext() != null){
                  currentNode = currentNode.getNext();
              }else{
                  break;
              }
          }
          return currentNode.getValue();
        }
        
        return null;
    }

    public Type dequeue(){
       if(!this.isEmpty()){
           Node<Type> currentNode = inputNode;
           Node<Type> auxNode = inputNode;

           while(true){
               if(currentNode.getNext() != null){
                   auxNode = currentNode;
                   currentNode = currentNode.getNext();
               }
               else{
                   auxNode.setNext(null);
                   break;
               }
           }
           return currentNode.getValue();
       }
           return null;
    }

    @Override
    public String toString(){
        String returnString = "";
        Node<Type> auxNode = inputNode;

        if(inputNode != null){
            while(true){
                returnString += auxNode.getValue()+ "---->";
                if(auxNode.getNext() != null){
                    auxNode = auxNode.getNext();
                }else{
                    returnString += "null";
                    break;
                }
                
            }
        }else{
            returnString = "null";
        }

        return returnString;
    }

}
