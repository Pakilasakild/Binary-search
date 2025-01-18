public class App {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Insert nodes into the BST
        tree.insert(4);
        tree.insert(2);
        tree.insert(6);
        tree.insert(3);
        tree.insert(1);
        tree.insert(5);
        tree.insert(7);

        // Display the BST using in-order traversal
        System.out.print("Inorder traversal of the BST: ");
        tree.inorder();
        System.out.println();

        // Search for specific values
        int[] keysToSearch = { 1, 9 };
        for (int key : keysToSearch) {
            if (tree.search(key))
                System.out.println("Key " + key + " found in the BST.");
            else
                System.out.println("Key " + key + " not found in the BST.");
        }
    }
}
