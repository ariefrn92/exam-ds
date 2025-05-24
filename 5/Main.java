public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10); // Hash table dengan 10 slot

        // Menambahkan data sesuai permintaan soal
        String[] items = {"Anting", "Baju", "Celana", "Gelas", "Gunting", "Handphone", 
                          "Buku", "Garpu", "Jarum", "Benang"};

        for (String item : items) {
            hashTable.insert(item);
        }

        // Cetak isi hash table
        System.out.println("Hash Table:");
        hashTable.printHashTable();
    }
}