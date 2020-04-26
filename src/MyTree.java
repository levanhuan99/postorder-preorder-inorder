public class MyTree<E> {
    private Node<E> root;
    private int size = 0;

    private class Node<E> {
        Node<E> left;
        Node<E> right;
        public E data;

        public Node(E data) {
            this.data = data;
        }
    }


    public void postOrder(Node<E> root){
        if (root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }

    }
    public void preOrder(Node<E> root){
        if (root!=null){
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public void inOrder(Node<E> root){
        if (root!=null){
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }














//    public E leftMost() {
//        if (root == null) {
//            return null;
//
//        } else {
//            Node<E> current = this.root;
//            while (current.left != null) {
//                current = current.left;
//            }
//            return current.data;
//        }
//    }
//
//    public E rightMost() {
//        if (root == null) {
//            return null;
//        } else {
//            Node<E> current = this.root;
//            while (current.right != null) {
//                current = current.right;
//            }
//            return current.data;
//        }
//    }
}
