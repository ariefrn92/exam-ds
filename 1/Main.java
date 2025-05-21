// Main class untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Contoh objek produk elektronik dan sembako
        Product laptop = new ElectronicProduct("Laptop ASUS", 9000000.0, 2);
        Product rice = new GroceryProduct("Beras Premium", 120000.0, "30-12-2025");

        // Menampilkan informasi produk (polymorphism)
        laptop.displayInfo();
        rice.displayInfo();
    }
}
