public class Custom_LL {
    static public class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node() {

        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public static Node head;
    public static Node tail;
    public int size;

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public void inserfirst(int val) {
        Node newnode = new Node(val);
        newnode.next = head;
        size++;
        head = newnode;
        if (tail == null) {
            tail = head;
        }
    }

    public void setHead(Node newHead) {
        Custom_LL.head = newHead;
    }

    public void insertlast(int val) {
        Node newnode = new Node(val);
        if (tail == null) {
            head = tail = newnode;
        }
        size++;
        tail.next = newnode;
        tail = newnode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public void deletefirst() {
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void insertrec_helper(int val, int ind) {
        head = ins_recursion(val, ind, head);
    }

    public Node ins_recursion(int val, int ind, Node node) {
        if (ind == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = ins_recursion(val, ind - 1, node.next);
        return node;
    }

    public static Node gettail() {
        return tail;
    }

    public void setTail(Node newTail) {
        Custom_LL.tail = newTail;
    }

    public Node gethead() {
        return head;
    }

public static Node getind(int ind) {
    if (ind < 0) {
        throw new IndexOutOfBoundsException("Index cannot be negative");
    }

    Node temp = head;
    int i = 0;
    while (temp != null && i < ind) {
        temp = temp.next;
        i++;
    }

    if (temp == null) {
        throw new IndexOutOfBoundsException("Index out of bounds");
    }

    return temp;
}


    public void remove_dups() {
        Node temp = head;
        while (temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
                size--;
            } else {
                temp = temp.next;
            }
        }
    }

    public void insert(int val, int ind) {
        Node temp = head;
        for (int i = 1; i < ind; i++) {
            temp = temp.next;
        }
        Node newnode = new Node(val, temp.next);
        size++;
        temp.next = newnode;
    }
    public static Node getmid(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node s=head;
        Node f=head;
        do{
            s=s.next;
            f=f.next.next;
        }while(f!=null && f.next!=null);

        return s;
    }

    public boolean detectCycle() {
        if (head == null) {
            return false;
        }
        int cnt = 0;
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                Node temp = slow.next;
                cnt += 1;
                while (temp != slow) {
                    temp = temp.next;
                    cnt += 1;
                }
                System.out.println(cnt);
                return true;
            }
        }

        return false;
    }

    public void createCycle() {
        Node temp = head;
        Node cycleStartNode = null;

        while (temp != null) {
            if (temp.val == 3) {
                cycleStartNode = temp;
            }
            temp = temp.next;
        }

        temp = head;
        while (temp != null && temp.next != null) {
            temp = temp.next;
        }

        if (temp != null) {
            temp.next = cycleStartNode;
        }
    }

    public static void main(String[] args) {
        Custom_LL ll = new Custom_LL();
        for (int i = 0; i < 7; i++) {
            ll.insertlast(i);
        }
        ll.display();        
    }
}
