// Parent class: Product
class Product {
    private String name;
    private double price;

    // Konstruktor untuk inisialisasi produk
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter untuk name
    public String getName() {
        return name;
    }

    // Getter untuk price
    public double getPrice() {
        return price;
    }

    // Method untuk menampilkan informasi produk (akan dioverride di class child)
    public void displayInfo() {
        System.out.println("Produk: " + name + " | Harga: Rp" + price);
    }
}