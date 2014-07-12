import java.util.*;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: Zhiyi Yang
 * Date: 24/01/14
 * Time: 2:51 PM
 */
public class Microsoft {

    class ListNode<T> {
        T element;
        ListNode<T> next;
    }

    class TreeNode<T> {
        T element;
        TreeNode<T> parent;
        TreeNode<T> leftChild;
        TreeNode<T> rightChild;
    }
    /**
     * Find the most frequent elements in a array
     */
    public static Integer find(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int element: array) {

            if (map.containsKey(element)) {
                map.put(element, map.get(element)+1);
            }

            else {
                map.put(element, 1);
            }
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        int pre = 0;
        int max = array[0];

        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            int key = entry.getKey();
            int value = entry.getValue();
            if (value > pre) {
                pre = value;
                max = key;
            }
        }

        return max;
    }


    /**
     *  Reverse a Linked List
     */
    public static ListNode reverse(ListNode node) {
        if (node.next == null) {
            return node;
        }
        else {
            ListNode pre = node;
            ListNode current = node.next;

            while (current != null) {


                pre.next = null;
                current.next = pre;

                pre = current;
                current = current.next;
            }

            return pre;
        }
    }

    /**
     * Reverse a Linked List recursively
     */
    public static ListNode reverseR(ListNode node) {
        if (node.next == null) {
            return node;
        }
        else {
            ListNode reveredTail = reverseR(node.next);
            reveredTail.next = node;
            node.next = null;
            return node;
        }
    }


    /**
     * BFS the binary tree
     */
    public static void BST(TreeNode tree) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(tree);
        TreeNode current = queue.poll();

        while (current != null) {
            System.out.println(current.element);
            queue.add(tree.leftChild);
            queue.add(tree.rightChild);
            current = queue.poll();
        }
    }

    /**
     * Print out all the combinations of a String.
     */
    public static void printCombinations(char[] s) {

        for (int j=0; j< s.length; j++) {

        }
    }

    /**
     * Convert a String to a integer
     */
    public static long atoi(String str) {
        return -1;
    }

    /**
     * Tower of Hanoi
     */
    public static void hanoi(n, x, y, z) {
        if (n==1) {
            move(x,z);
        }
        else {
            hanoi(n-1, x, z, y);
            move(x, z):
            hanoi(n-1, y, z, x);
        }
    }

}
