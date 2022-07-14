package BST;
public class Program<Type> {
    public static void main(String[] args) throws Exception {
        BinarySearchTree<String> bT = new BinarySearchTree<String>();
        bT.add("eu");
        bT.add("me");
        bT.add("amo");
        System.out.print(bT.search("amo", bT.getRoot()));
        bT.delete("eu");
    }
}
