/**
 * Created with IntelliJ IDEA.
 * User: Zhiyi Yang
 * Date: 19/01/14
 * Time: 3:36 PM
 * Reference: http://en.wikipedia.org/wiki/Binary_search_tree
 */
public class Tree {
    int key;
    Tree parent;
    Tree left;
    Tree right;

    public Tree(int key) {
        this.key = key;
    }

    public Tree search(int key) {
        if (this.key == key) {
            return this;
        }
        else if (key < this.key) {
            return this.left.search(key);
        }
        else {
            return this.right.search(key);
        }
    }

    public void insert(int value){
        Tree child = new Tree(value);
        if (value < this.key) {
            if (this.left == null)
                this.left = child;
            else
                this.left.insert(value);
        }
        else {
            if(this.right ==null)
                this.right = child;
            else
                this.right.insert(value);
        }
    }

    public void delete(int value){
        if (value < this.key) {
            this.left.delete(value);
        }
        else if (value > this.key){
            this.right.delete(value);
        }

        /* Delete the key here. */
        else {
            if (this.left != null && this.right != null) {
                Tree successor = this.right.findMin();
                this.key = successor.key;
            }
            else if(this.left != null) {
                this.swapWithParent(this.left);
            }
            else if(this.right != null) {
                this.swapWithParent(this.right);
            }
            else {
                this.swapWithParent(null);
            }
        }
    }

    private Tree findMin() {
        if (this.left == null) {
            return this;
        }
        else {
            return this.left.findMin();
        }
    }

    private void swapWithParent (Tree t) {
        if (this==this.parent.left ) {
            this.parent.left = t;
        }
        else {
            this.parent.right = t;
        }

        if (t!=null) {
            t.parent = this.parent;
        }
    }

    public void preOrder(){
        System.out.println(this.key);

        this.left.preOrder();
        this.right.preOrder();
    }

    public void postOrder(){
        this.left.postOrder();
        this.right.postOrder();

        System.out.println(this.key);
    }

    public void inOrder(){
        this.left.inOrder();

        System.out.println(this.key);

        this.right.inOrder();
    }
}
