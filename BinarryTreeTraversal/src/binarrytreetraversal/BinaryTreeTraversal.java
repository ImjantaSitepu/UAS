public class BinaryTreeTraversal {

    private Node root;
    BinaryTreeTraversal()
    {
        root = null;
    }

    static class Node
    {
        int value;
        Node left;
        Node right;
        Node(int value)
        {
            this.value = value;
            left = null;
            right = null;
        }
        public void displayData()
        {
            System.out.print(value + " ");
        }
    }

    public void insert(int i)
    {
        root = insert(root, i);
    }
    //Inserting node - recursive method
    public Node insert(Node node, int value)
    {
        if(node == null){
            return new Node(value);
        }

        if(value < node.value)
        {
            node.left = insert(node.left, value);
        }

        else if(value > node.value)
        {
            node.right = insert(node.right, value);
        }
        return node;
    }

    public Node find(int searchedValue)
    {
        Node current = root;
        while(current.value != searchedValue)
        {
            if(searchedValue < current.value)

                current = current.left;
            else

                current = current.right;
            if(current == null)
            {
                return null;
            }
        }
        return current;
    }
    // InOrder Traversal
    public void inOrder(Node node)
    {
        if(node != null)
        {
            inOrder(node.left);
            node.displayData();
            inOrder(node.right);
        }
    }
    // Preorder traversal
    public void preOrder(Node node)
    {
        if(node != null){
            node.displayData();
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    // Postorder traversal
    public void postOrder(Node node)
    {
        if(node != null)
        {
            postOrder(node.left);
            postOrder(node.right);
            node.displayData();
        }
    }
    public static void main(String[] args)
    {
        BinaryTreeTraversal bst = new BinaryTreeTraversal();
        bst.insert(12);
        bst.insert(22);
        bst.insert(32);
        bst.insert(42);
        bst.insert(52);
        bst.insert(62);
        System.out.println("Inorder traversal binary tree");
        bst.inOrder(bst.root);
        System.out.println();
        System.out.println("Preorder traversal binary tree");
        bst.preOrder(bst.root);
        System.out.println();
        System.out.println("Postorder traversal binary tree");
        bst.postOrder(bst.root);
        System.out.println();
    }
}