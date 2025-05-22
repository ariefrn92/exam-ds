public class Main {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        
        // Jawaban Soal a
        list.insert(43);
        list.insert(5);
        list.insert(9);
        list.insert(42);
        list.insert(6);
        list.insert(11);
        list.insert(41);
        list.insert(7);
        list.insert(13);
        list.insert(100);
        list.insert(12);
        list.insert(70);
        list.insert(24);
        list.insert(40);
        list.insert(36);
        list.insert(16);
        list.insert(35);
        list.insert(14);
        list.insert(30);
        list.insert(25);
        list.display();

        // Jawaban Soal b
        list.insertAtPosition(10,59);
        list.display();

        // Jawaban Soal c
        list.delete(40);
        list.display();

    }
       
}