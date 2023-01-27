public class BinaryTreeMax {
    public static class Node
    {
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public Node root;
    public BinaryTreeMax()
    {
        root = null;
    }

    public int largestElement(Node temp)
    {
        if(root == null)
        {
            System.out.println("Data Kosong");
            return 0;
        }
        else
        {
            int leftMax, rightMax;

            int max = temp.data;

            if(temp.left != null){
                leftMax = largestElement(temp.left);

                max = Math.max(max, leftMax);
            }

            if(temp.right != null){
                rightMax = largestElement(temp.right);

                max = Math.max(max, rightMax);
            }
            return max;
        }
    }
    public static void main(String[] args)
    {
        BinaryTreeMax bt = new BinaryTreeMax();

        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.right.left = new Node(5);
        bt.root.right.right = new Node(6);
        bt.root.right.left = new Node(7);
        bt.root.right.right = new Node(8);

        System.out.println("Elemen terbesar adalah " + bt.largestElement(bt.root));
    }
}