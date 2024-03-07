public class Minuman extends Produk {
    public String getTipe() {
        String tipe = "Minuman";
        return tipe;
    }
    Minuman(String nama, int harga, String tipe){
        super(nama, harga, tipe);
    }

    public int tax(int harga){
        harga = harga/10;
        return harga;
    }
    @Override
    public void display() {
        System.out.println("\nKategori\t\t: " + getTipe());
        super.display();
        System.out.println("Harga Produk\t: " + (getHarga() + tax(harga)));
    }
}
