package BST;
public class Node<Type> {
    private Type value;
    private Node<Type> nodeLeft;
    private Node<Type> nodeRight;

    public Node(){
    }

    public Node(Type value){
        this.value = value;
    }

    public Type getValue(){
        return value;
    }
    public void setValue(Type value){
        this.value = value;
    }

    public Node<Type> getNodeLeft(){
        return nodeLeft;
    }
    public void setNodeLeft(Node<Type> nodeLeft){
        this.nodeLeft = nodeLeft;
    }

    public Node<Type> getNodeRight(){
        return nodeRight;
    }
    public void setNodeRight(Node<Type> nodeRight){
        this.nodeRight = nodeRight;
    }
    @Override
     public String toString(){
         return value.toString();
     }
}
