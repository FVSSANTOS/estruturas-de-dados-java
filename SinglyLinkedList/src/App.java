public class App<Type> {
    public static void main(String[] args) throws Exception {
       SinglyLinkedList list = new SinglyLinkedList<>();

       list.add(11);
       list.add(5);
       list.add(1);
       list.add(2);
       list.add(4);
       System.out.println(list);
       list.remove(11);
       System.out.println(list);
       System.out.println(list.search(9));
    }
}
