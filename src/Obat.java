public class Obat extends Produk {
    private String tipe = "Obat";

    public String getTipe() {
        return tipe;
    }

    Obat(String nama, int harga, String tipe){
        super(nama, harga, tipe);
    }
    @Override
    public void display() {
        System.out.println("\nKategori\t\t: " + getTipe());
        super.display();
        System.out.println("Harga Produk\t: " + (getHarga() + harga/5));
    }
}
