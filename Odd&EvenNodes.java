import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class GFG {

    static class Node {
        int val;
        ArrayList<Node> children;

        Node(int val) {
            this.val = val;
            this.children = new ArrayList<>();
        }
    }

    static class Pair {
        Node first;
        int second;

        Pair(Node node, int val) {
            this.first = node;
            this.second = val;
        }
    }

    static int evenOddLevelDifference(Node root) {
        int evenSum = 0, oddSum = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 1));

        while (!q.isEmpty()) {
            Pair currNode = q.poll();
            int currLevel = currNode.second;
            int currVal = currNode.first.val;

            if (currLevel % 2 == 1) {
                oddSum += currVal;
            } else {
                evenSum += currVal;
            }

            for (Node child : currNode.first.children) {
                q.add(new Pair(child, currLevel + 1));
            }
        }

        return (oddSum - evenSum);
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.children.add(new Node(2));
        root.children.add(new Node(3));
        root.children.add(new Node(-5));
        root.children.get(0).children.add(new Node(-1));
        root.children.get(0).children.add(new Node(3));
        root.children.get(2).children.add(new Node(-2));
        root.children.get(2).children.add(new Node(6));

        System.out.println(evenOddLevelDifference(root));
    }
}
