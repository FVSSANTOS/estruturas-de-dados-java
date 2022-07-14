public class DoublyListNode<Type> {
    
    private Type value;
    private DoublyListNode<Type> next;
    private DoublyListNode<Type> previous;

    public DoublyListNode(Type value){
       this.value = value;
    }
    public Type getValue() {
        return value;
    }
    public void setValue(Type value) {
        this.value = value;
    }

    public DoublyListNode<Type> getNext() {
        return next;
    }
    public void setNext(DoublyListNode<Type> next) {
        this.next = next;
    }

    public DoublyListNode<Type> getPrevious() {
        return previous;
    }
    public void setPrevious(DoublyListNode<Type> previous) {
        this.previous = previous;
    }
    
}
