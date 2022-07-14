public class CircularLinkedList <Type>{
    

    private Node<Type> head;
    private Node<Type> tail;
    private Integer size;


    public CircularLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size == 0 ? true : false;
    }

    private Node<Type> getNode(int index){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("A lista está vazia!");
        }

        if(index == 0){
            return this.tail;
        }

        Node<Type> auxNode = this.tail;
        for(int i = 0; (i < index); i++){
            auxNode = auxNode.getNext();
        }

        return auxNode;
    }

    public Type get(int index){
        return this.getNode(index).getValue();
    }

    public void remove(int index){
        if(index >= this.size){
            throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista!");
        }
        
        Node<Type> auxNode = this.tail;
        if(index == 0){
            this.tail = this.tail.getNext();
            this.head.setNext(this.tail);
        }else if(index == 1){
            this.tail.setNext(this.tail.getNext().getNext());
        }else{
            for(int i=0; i < index-1; i++){
                auxNode = auxNode.getNext();
            }

            auxNode.setNext(auxNode.getNext().getNext());
        }

        this.size--;
    }

    public void add(Type value){
        Node<Type> newNode = new Node<>(value);
        if(isEmpty()){
            this.head = newNode;
            this.tail = this.head;
            this.head.setNext(tail);
        }else{
            newNode.setNext(this.tail);
            this.head.setNext(newNode);
            this.tail = newNode;
        }
        this.size++;
    }

    @Override
    public String toString(){
        String str = "";

        Node<Type> auxNode = this.tail;
        for(int i = 0; i< this.size(); i++){
            str += "[Node{value="+auxNode.getValue()+"}] ---->";
            auxNode = auxNode.getNext();
        }

        str += isEmpty() ? "(Return to begin)" : "[]";

        return str;
    }
}
