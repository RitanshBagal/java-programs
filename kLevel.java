public class kLevel {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
            this.left = null;
            this.right = null;
        }
    }
    public static void kLevel(Node root, int level, int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data+" ");
        }
        kLevel(root.left, level+1, k);
        kLevel(root.right, level+1, k);
    }
    public static void main(String[] args) {
        Node newNode = new Node(0);
        newNode.left = new Node(1);
        newNode.right = new Node(2);

        kLevel(newNode, 0, 1);
    }
}
