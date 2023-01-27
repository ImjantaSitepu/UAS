package binarytreeinsert;

public class BinaryTreeInsert
{
    public static void main(String[] args)
    {
        new BinaryTreeInsert().run();
    }
    static class Node
    {
        Node left;
        Node right;
        int value;
        public Node(int value)
        {
            this.value = value;
        }
    }
    public void run()
    {
        Node rootnode = new Node(12);
        insert(rootnode, 14);
        insert(rootnode, 16);
        insert(rootnode, 18);
        insert(rootnode, 20);
        insert(rootnode, 22);
    }
    public void insert(Node node, int value)
    {
        if (value < node.value)
        {
            if (node.left != null)
            {
                insert(node.left, value);
            } else
            {
                System.out.println("  Terinput " + value + " ke Node kiri " + node.value);
                node.left = new Node(value);
            }
        }
        else if (value > node.value)
        {
            if (node.right != null)
            {
                insert(node.right, value);
            } else
            {
                System.out.println("  Terinput " + value + " ke Node kanan " + node.value);
                node.right = new Node(value);
            }
        }
    }
}