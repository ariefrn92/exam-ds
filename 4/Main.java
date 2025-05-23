// Main class untuk Binary Search Tree
public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        
        // Menyisipkan elemen ke dalam BST
        bst.insert(10);  // Root
        bst.insert(17);
        bst.insert(25);
        bst.insert(4);
        bst.insert(7);
        bst.insert(9);
        bst.insert(2);
        bst.insert(15);
        bst.insert(21);
        bst.insert(27);

        System.out.println("Inorder traversal dari Binary Search Tree:");
        bst.inorder();
    }
}