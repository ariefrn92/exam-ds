class Stack {
    private int arr[]; // Array untuk menyimpan elemen stack
    private int top; // Indeks elemen teratas dalam stack
    private int capacity; // Kapasitas maksimum stack

    // Konstruktor untuk inisialisasi stack
    Stack(int size) {
            arr = new int[size];
        capacity = size;
        top = -1; // Stack kosong pada awalnya
    }

    // Metode untuk menambahkan elemen ke stack (Push)
    void push(int x) {
        if (top == capacity - 1) { // Cek apakah stack penuh
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x; // Tambahkan elemen ke stack dan tingkatkan indeks top
        System.out.println(x + " ditambahkan ke stack");
    }

    // Metode untuk menghapus elemen dari stack (Pop)
    int pop() {
        if (top == -1) { // Cek apakah stack kosong
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--]; // Kembalikan elemen teratas dan kurangi indeks top
    }

    // Metode untuk melihat elemen teratas tanpa menghapusnya (Peek)
    int peek() {
        if (top == -1) { // Cek apakah stack kosong
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }
}

public class StackArray {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
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
   