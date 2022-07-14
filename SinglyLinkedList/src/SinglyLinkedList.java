public class SinglyLinkedList<Type extends Comparable> {
    
    private SinglyListNode<Type> head;
    private int size=0;

    public SinglyLinkedList(){
        this.head = null;
    }

    public boolean isEmpty(){
        return head == null ? true : false;
    }

    public int getSize(){
        return this.size;
    }

    public void add(Type value){
        SinglyListNode<Type> newNode = new SinglyListNode<>(value);
        if(this.isEmpty()){
            head = newNode;
            size++;
            return;
        }
        SinglyListNode<Type> currentNode = head;
        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(newNode);
        size++;
    }

    private SinglyListNode<Type> searchPrivate(Type value){
        if(isEmpty()){
            return null;
        }
        SinglyListNode<Type> currentNode = head;
        if(currentNode.getValue().compareTo(value) == 0){
              return currentNode;
        }
        while(currentNode != null){
            if(currentNode.getNext().getValue().compareTo(value) == 0){
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }

    public Type search(Type value){
        if(isEmpty()){
            return null;
        }
        SinglyListNode<Type> currentNode = head;
        while(currentNode != null){
            if(currentNode.getValue().compareTo(value) == 0){
                return currentNode.getValue();
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }

    public void remove(Type value){
       SinglyListNode<Type> aux = searchPrivate(value);
       if(head.getValue().compareTo(value) == 0){
           this.head = head.getNext(); 
       }
       if(aux != null){
           aux.setNext(aux.getNext().getNext());
       }
       
    }

    @Override
    public String toString(){
        String str = " ";
        SinglyListNode<Type> aux = head;
       while(aux != null){
           str += "->{"+aux.getValue()+"} ";
           aux = aux.getNext();
       }
        return str;
    }
}
