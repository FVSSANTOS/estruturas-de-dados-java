public class DoublyLinkedList<Type extends Comparable> {

    private DoublyListNode<Type> head;
    private DoublyListNode<Type> tail;
    private int size;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Type get(int index){
        return this.getNode(index).getValue();
    }

    private DoublyListNode<Type> getNode(int index){
        DoublyListNode<Type> aux = head;
     
        for(int i = 0; (i < index) && (aux != null); i++){
            aux = aux.getNext();
        }

        return aux;
    }

    public int size(){
        return size;
    }

    public void add(int index, Type value){
        DoublyListNode<Type> aux = getNode(index);
        DoublyListNode<Type> newNode = new DoublyListNode<>(value);
        newNode.setNext(aux);

        if(newNode.getNext() != null){
            newNode.setPrevious(aux.getPrevious());
            newNode.getNext().setPrevious(newNode);
        }else{
            newNode.setNext(tail);
            tail = newNode;
        }
        
        if(index == 0){
            head = newNode;
        }else{
            newNode.getPrevious().setNext(newNode);
        }
        this.size++;
    }
    public void add(Type value){
        DoublyListNode<Type> newNode = new DoublyListNode<>(value);
        newNode.setNext(null);
        newNode.setPrevious(tail);
        if(head == null){
            head = newNode;
        }
        if(tail != null){
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }

    public void remove(int index){
        if(index == 0){
            head = head.getNext();
            if(head != null){
                head.setPrevious(null);
            }
        }else{
            DoublyListNode<Type> aux = getNode(index);
            aux.getPrevious().setNext(aux.getNext());
            aux.getNext().setPrevious(aux.getPrevious());
        }
        this.size--;
    }

    public DoublyListNode<Type> search(Type value) {
		DoublyListNode<Type> currentHead = this.head;
		DoublyListNode<Type> currentTail = this.tail;
		if(isEmpty()) {
			return null;
		}
		while(currentHead != null || currentTail != null) {
			if(currentHead.getValue().compareTo(value) == 0) {
				return currentHead;
			}
			if(currentTail.getValue().compareTo(value) == 0) {
				return currentTail;
			}
			currentHead = currentHead.getNext();
			currentTail = currentTail.getPrevious();
		}
        return null;
    }

    public boolean isEmpty(){
        return size() == 0 ? true : false;
    }

    @Override
    public String toString(){
        String str = " ";
        DoublyListNode<Type> aux = head;
        for(int i = 0; i< size(); i++){
            str += "{"+aux.getValue()+"} -> ";
        }

        str += null;
        return str;
    }

}
