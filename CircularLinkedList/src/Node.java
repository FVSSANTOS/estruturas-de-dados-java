public class Node <Type>{
    
    private Type value;
    private Node<Type> next;

  public Node(Type value){
    this.next = null;
    this.value = value;
  }  

  public Node<Type> getNext() {
      return next;
  }
  public void setNext(Node<Type> next) {
      this.next = next;
  }
  
  public Type getValue() {
      return value;
  }
  public void setValue(Type value) {
      this.value = value;
  }

  @Override
  public String toString(){
    return "Node{"+
            "value="+ value +
            "}";
  }
}
