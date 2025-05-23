// Class BST dengan operasi insert dan traversal
class BST {
    BSTNode root;

    public BST() {
        root = null;
    }

    // Method untuk menyisipkan node baru
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Rekursif method untuk memasukkan node baru
    BSTNode insertRec(BSTNode root, int key) {
        if (root == null) {
            root = new BSTNode(key);
            return root;
        }
        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    // Method untuk inorder traversal
    void inorder() {
        inorderRec(root);
    }

    // Rekursif method untuk inorder traversal
    void inorderRec(BSTNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
}