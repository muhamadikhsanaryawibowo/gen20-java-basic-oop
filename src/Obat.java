public class Obat extends Produk {

    public String getTipe() {
        String tipe = "Obat";
        return tipe;
    }

    Obat(String nama, int harga, String tipe){
        super(nama, harga, tipe);
    }

    public int tax (int harga){
        harga = harga/5;
        return harga;
    }
    @Override
    public void display() {
        System.out.println("\nKategori\t\t: " + getTipe());
        super.display();
        System.out.println("Harga Produk\t: " + (getHarga() + tax(harga)));
    }
}
