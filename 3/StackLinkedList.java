class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;

    // Konstruktor untuk inisialisasi stack kosong
    Stack() {
        this.top = null;
    }

    // Metode untuk menambahkan elemen ke stack (Push)
    void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        System.out.println(x + " ditambahkan ke stack");
    }

    // Metode untuk menghapus elemen dari stack (Pop)
    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    // Metode untuk melihat elemen teratas tanpa menghapusnya (Peek)
    int peek() {
        if (top == null) {
            System.out.println("Stack kosong");
            return -1;
        }
        return top.data;
    }

    // Metode untuk mengecek apakah stack kosong
    boolean isEmpty() {
        return top == null;
    }
}

public class StackLinkedList {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(53);
        stack.push(64);
        stack.push(128);
        stack.push(113);
        stack.push(124);
        stack.push(248);
        stack.push(122);
        stack.push(134);
        stack.push(268);
        stack.push(280);

        System.out.println("Elemen teratas: " + stack.peek());
        System.out.println("Elemen yang di-pop: " + stack.pop());
        System.out.println("Elemen yang di-pop: " + stack.pop());
    }
}