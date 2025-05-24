class HashTable {
    private String[] table;
    private int size;

    // Constructor
    public HashTable(int size) {
        this.size = size;
        table = new String[size]; // Gunakan array untuk linear probing
    }

    // Simple Hash Function
    private int hashFunction(String key) {
        return key.length() % size;
    }

    // Method to insert key using Linear Probing
    public void insert(String key) {
        int index = hashFunction(key); // Dapatkan indeks menggunakan hash function

        // Linear Probing untuk mencari slot kosong
        while (table[index] != null) {
            index = (index + 1) % size; // Cek slot berikutnya
        }

        table[index] = key; // Simpan data di slot kosong
    }

    // Method to search key
    public boolean search(String key) {
        int index = hashFunction(key);

        // Linear probing untuk mencari elemen
        while (table[index] != null) {
            if (table[index].equals(key)) {
                return true;
            }
            index = (index + 1) % size; // Cek slot berikutnya
        }

        return false; // Tidak ditemukan
    }

    // Method to print the hash table
    public void printHashTable() {
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + (table[i] != null ? table[i] : "empty"));
        }
    }
}