public class BinarySearchTree {
    Node node;

    public BinarySearchTree() {
        node = null;
    }

    // Method to insert a new key
    void insert(int key) {
        node = insertRec(node, key);
    }

    // Recursive function to insert a new key
    Node insertRec(Node node, int key) {
        if (node == null) {
            node = new Node(key);
            return node;
        }
        if (key < node.key)
            node.left = insertRec(node.left, key);
        else if (key > node.key)
            node.right = insertRec(node.right, key);
        return node;
    }

    // Method to search for a key in the BST
    boolean search(int key) {
        return searchRec(node, key);
    }

    // Recursive function to search for a key
    boolean searchRec(Node node, int key) {
        if (node == null)
            return false;
        if (node.key == key)
            return true;
        return key < node.key ? searchRec(node.left, key) : searchRec(node.right, key);
    }

    // Method for in-order traversal of the BST
    void inorder() {
        inorderRec(node);
    }

    // Recursive function for in-order traversal
    void inorderRec(Node node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.print(node.key + " ");
            inorderRec(node.right);
        }
    }
}
