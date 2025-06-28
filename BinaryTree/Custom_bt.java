import java.util.*;

public  class Custom_bt {
    public static class Node {
        int val;
        Node left;
        Node right;

        public  Node(int val) {
            this.val = val;
        }
    }

    public static Node root;

    public void populate(Scanner scanner) {
        System.out.println("enter root node val");
        int val = scanner.nextInt();
        root = new Node(val);
        populate(scanner, root);
    }

    public Node populate(Scanner scanner,Node node){
        if(node==null){
            return null;
        }
        System.out.println("want to insert left of "+node.val);
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("enter val for left of "+node.val);
            int val=scanner.nextInt();
            node.left=new Node(val);
            populate(scanner,node.left);
        }
        System.out.println("want to insert right of "+node.val);
                boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("enter val for right of "+node.val);
            int val=scanner.nextInt();
            node.right=new Node(val);
            populate(scanner,node.right);
        }
        return node;
    }
    public Node buildFixedTree() {
         root = new Node(3);

        root.left = new Node(4);
        root.right = new Node(8);

        root.left.left = new Node(2);
        root.left.right = new Node(5);

        root.right.left = new Node(7);
        root.right.right = new Node(6);

        root.left.right.left=new Node(1);
        root.left.right.right=new Node(9);

        // root.right.right.left=new Node(2);

        // root.right.right.left.right=new Node(44);

        

        return root;
    }

    public void display() {
        display(root, "");
    }

    public void display(Node node, String intend) {
        if (node == null) {
            return;
        }
        System.out.println(intend + node.val);
        display(node.left, " " + "\t");
        display(node.right, " " + "\t");
    }

    public void prettydisplay() {
        prettydisplay(root, 0);
    }

    public void prettydisplay(Node node, int level) {
        if (node == null) {
            return;
        }
        prettydisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|--------->" + node.val);
        } else {
            System.out.println(node.val);
        }
        prettydisplay(node.left, level + 1);
    }

    public void preodrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        preodrder(node.left);
        preodrder(node.right);
    }

    public void inodrder(Node node) {
        if (node == null) {
            return;
        }
        inodrder(node.left);
        System.out.println(node.val);
        inodrder(node.right);
    }

    public void postodrder(Node node) {
        if (node == null) {
            return;
        }
        postodrder(node.left);
        postodrder(node.right);
        System.out.println(node.val);

    }
    

    
   

}