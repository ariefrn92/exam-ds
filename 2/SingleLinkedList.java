public class SingleLinkedList {
    Node head; // Head menunjuk ke node pertama dalam Linked List

    // Menambahkan elemen di akhir Linked List
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Menampilkan semua elemen dalam Linked List
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Menambahkan Fitur insertAtPosition(int position, int data)
    void insertAtPosition(int position, int data) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Posisi melebihi panjang Linked List");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Menambahkan Fitur Penghapusan Node
    void delete(int key) {
        Node temp = head, prev = null;

        // Jika node yang akan dihapus adalah head
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        // Cari node yang akan dihapus
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // Jika node tidak ditemukan
        if (temp == null) return;
        
        // Lepaskan node dari Linked List
        prev.next = temp.next;
    }

}