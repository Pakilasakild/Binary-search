public class BinarySearchTree {
    Node root;

    // Constructor to initialize the root of the tree
    BinarySearchTree() {
        root = null;
    }

    // Method to insert a new value into the tree
    void insert(int value) {
        root = insertRecursive(root, value);
    }

    // Recursive helper method for insertion
    Node insertRecursive(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.data) {
            root.left = insertRecursive(root.left, value);
        } else if (value > root.data) {
            root.right = insertRecursive(root.right, value);
        }

        return root;
    }

    // Method to perform in-order traversal of the tree
    void inOrderTraversal() {
        inOrderRecursive(root);
    }

    // Recursive helper method for in-order traversal
    void inOrderRecursive(Node root) {
        if (root != null) {
            inOrderRecursive(root.left);
            System.out.print(root.data + " ");
            inOrderRecursive(root.right);
        }
    }

    // Main method
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insert values into the tree
        bst.insert(4);
        bst.insert(2);
        bst.insert(6);
        bst.insert(3);
        bst.insert(1);
        bst.insert(5);
        bst.insert(7);

        // Print the tree in sorted order
        System.out.print("In-order Traversal: ");
        bst.inOrderTraversal();
        System.out.println();
    }
}
