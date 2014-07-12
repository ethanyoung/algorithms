/**
 * Created with IntelliJ IDEA.
 * User: Zhiyi Yang
 * Date: 18/01/14
 * Time: 8:39 PM
 */
public class LinkedList {
    int key;
    LinkedList next;

    public LinkedList reconstruct(LinkedList head, int val) {

        LinkedList left = null;
        LinkedList right = null;

        LinkedList leftHead = null;
        LinkedList rightHead = null;

        LinkedList current = head;

        while (current != head) {

            if (current.key < val) {

                if (left == null) {
                    left = current;
                    leftHead = current;
                }

                left.next = current;

            }

            else {

                if (right == null) {
                    right = current;
                    rightHead = current;
                }

                right.next = current;

            }

            current = current.next;
        }

        if (leftHead == null) {
            return rightHead;
        }

        else {
            left.next = rightHead;
            return leftHead;
        }
    }
}
