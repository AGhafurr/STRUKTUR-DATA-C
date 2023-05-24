package Latihan;

public class Main {
    public static void main(String[] args) {
        BinaryTree Pohon = new BinaryTree();

        Pohon.NewNode(20);
        Pohon.NewNode(2);
        Pohon.NewNode(25);
        Pohon.NewNode(37);
        Pohon.NewNode(16);

        System.out.print("\nPre Order\t: ");
        Pohon.preOrder(Pohon.root);
        System.out.print("\nIn Order\t: ");
        Pohon.inOrder(Pohon.root);
        System.out.print("\nPost Order\t: ");
        Pohon.postOrder(Pohon.root);

    }
}