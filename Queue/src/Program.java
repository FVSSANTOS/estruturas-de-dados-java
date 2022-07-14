public class Program {
    public static void main(String[] args) throws Exception {
       
        Queue myQueue = new Queue();

        myQueue.enqueue("primeiro");
        myQueue.enqueue("segundo");
        myQueue.enqueue("terceiro");
        myQueue.enqueue("quarto");

        System.out.println(myQueue);
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue);
        System.out.println(myQueue.first());
    }
}
