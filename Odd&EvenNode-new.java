//Java solution
public class sample
{
public static class Node
{
Node left;
Node right;
int data;
public Node(int data)
{
this.data = data;
}
}
public static int findDifference(Node root)
{
if(root == null)
return 0;
return root.data - findDifference(root.left) - findDifference(root.right);
}
// main function
public static void main(String[] args)
{
Node root = new Node(4);
root.left = new Node(2);
root.right = new Node(6);
root.left.left = new Node(1);
root.left.right = new Node(3);
root.right.left = new Node(5);
root.right.right = new Node(7);
int difference = findDifference(root);
System.out.println("Difference between the sum of the odd level and even level nodes
of a binary tree is: " + difference);
}
}
