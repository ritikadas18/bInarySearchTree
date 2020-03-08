package BinarySearchTree;
import node.TreeNode;
public class myBinarySearchTree {
    TreeNode root;
    public TreeNode getRoot() {
        return root;
    }
    //insert
    public void insert(int data) {
        //statements
        TreeNode node = new TreeNode(data);
        if (root == null) {
            root = node;
        } else {
            TreeNode temp = root;
            TreeNode parent = null;
            while (temp != null) {
                parent=temp;
                if (node.getData() <= temp.getData()) {
                    temp = temp.getLeft();
                }
                else {
                    temp = temp.getRight();
                }
                if (node.getData() <= parent.getData()) {
                    parent.setLeft(node);
                }
                else {
                    parent.setRight(node);
                }
            }
        }
    }
}
