/**
 * Created with IntelliJ IDEA.
 * User: Zhiyi Yang
 * Date: 21/01/14
 * Time: 10:54 PM
 */
public class AVLTree{

    int key;
    AVLTree left;
    AVLTree right;

    public AVLTree (int key) {
        this.key = key;
    }

    private int getLeftHeight() {
        int h = 0;
        AVLTree current = this;
        while (current != null) {
            current = current.left;
            h++;
        }
        return h;
    }

    private int getRightHeight() {
        int h = 0;
        AVLTree current = this;
        while (current != null) {
            current = current.right;
            h++;
        }
        return h;
    }

    public int getBalanceFactor() {
        return this.getLeftHeight() - this.getRightHeight();
    }

    public void balance() {

        /* The left column. */
        if (this.getBalanceFactor() == 2) {

            AVLTree left = this.left;

            /* Left Right Case. */
            if (left.getBalanceFactor() == -1) {
                left.rotateLeft();
            }

            /* Left Left Case. */
            this.rotateRight();
        }

        /* The right column*/
        else if (this.getBalanceFactor() == -2){

            AVLTree right = this.right;

            /* Right Left Case */
            if (right.getBalanceFactor() == 1) {
                right.rotateRight();
            }

            /* Right Right Case */
            this.rotateLeft();
        }
    }

    private void rotateLeft() {

    }

    private void rotateRight() {

    }

}
