public class Makanan extends Produk {

    Makanan(String nama, int harga, String tipe){
        super(nama, harga, tipe);
    }

    public String getTipe() {
        String tipe = "Makanan";
        return tipe;
    }

    public int tax(int harga){
        harga = harga/100*15;
        return harga;
    }

    @Override
    public void display() {
        System.out.println("\nKategori\t\t: " + getTipe());
        super.display();
        System.out.println("Harga Produk\t: " + (getHarga() + tax(harga)));
    }
}
