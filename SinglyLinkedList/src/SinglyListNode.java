public class SinglyListNode<Type> {
    
    private Type value;
    private SinglyListNode<Type> next;

    public SinglyListNode(){
        this.next = null;
    }
    public SinglyListNode(Type value){
        this.value = value;
        this.next = null;
    }
    public SinglyListNode(Type value, SinglyListNode<Type> next){
      this.value = value;
      this.next = next;
    }

    public SinglyListNode<Type> getNext() {
        return next;
    }
    public void setNext(SinglyListNode<Type> next) {
        this.next = next;
    }

    public Type getValue() {
        return value;
    }
    public void setValue(Type value) {
        this.value = value;
    }

}
