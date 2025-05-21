// Child class: GroceryProduct untuk produk sembako
class GroceryProduct extends Product {
    private String expirationDate; // tanggal kedaluwarsa

    public GroceryProduct(String name, double price, String expirationDate) {
        super(name, price);  // memanggil konstruktor Product
        this.expirationDate = expirationDate;
    }

    // Getter untuk expirationDate
    public String getExpirationDate() {
        return expirationDate;
    }

    // Override method displayInfo untuk menampilkan informasi produk sembako
    @Override
    public void displayInfo() {
        System.out.println("Produk Sembako: " + getName() 
                + " | Harga: Rp" + getPrice() 
                + " | Kedaluwarsa: " + expirationDate);
    }
}