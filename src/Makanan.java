public class Makanan extends Produk {
    private String tipe = "Makanan";

    Makanan(String nama, int harga, String tipe){
        super(nama, harga, tipe);
    }

    public String getTipe() {
        return tipe;
    }

    @Override
    public void display() {
        System.out.println("\nKategori\t\t: " + getTipe());
        super.display();
        System.out.println("Harga Produk\t: " + (getHarga() + harga/100*15));
    }
}
