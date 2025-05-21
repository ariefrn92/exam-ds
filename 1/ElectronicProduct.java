// Child class: ElectronicProduct untuk produk elektronik
class ElectronicProduct extends Product {
    private int warrantyYears; // lama garansi dalam tahun

    public ElectronicProduct(String name, double price, int warrantyYears) {
        super(name, price);  // memanggil konstruktor Product
        this.warrantyYears = warrantyYears;
    }

    // Getter untuk warrantyYears
    public int getWarrantyYears() {
        return warrantyYears;
    }

    // Override method displayInfo untuk menampilkan informasi produk elektronik
    @Override
    public void displayInfo() {
        System.out.println("Produk Elektronik: " + getName() 
                + " | Harga: Rp" + getPrice() 
                + " | Garansi: " + warrantyYears + " tahun");
    }
}