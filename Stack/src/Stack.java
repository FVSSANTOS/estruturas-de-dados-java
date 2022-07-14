public class Stack <Type> {
    
    private Node<Type> refNode;

    public Stack(){
        this.refNode = null;
    }

    public boolean isEmpty(){
    return refNode == null? true : false;
    }
    
    public Node<Type> top(){
       return refNode;
    }

    public void push(Type value){
        push(new Node<Type>(value));
    }
    private void push(Node<Type> newNode){
      Node<Type> auxNode = refNode;
      refNode = newNode;
      refNode.setNodePrevious(auxNode);
    }

    public Node<Type> pop(){
      if(!this.isEmpty()){
        Node<Type> nodePoped = refNode;
        refNode = refNode.getNodePrevious();
        return nodePoped;
      }
      return null;
    }

  
}
