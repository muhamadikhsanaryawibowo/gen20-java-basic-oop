public class Produk {
    private String nama;
    protected int harga;
    protected String tipe;

    Produk(String nama, int harga, String tipe){
        setNama(nama);
        setHarga(harga);
        this.tipe = tipe;
    }

    public String getNama() {return nama;}

    public int getHarga() {return harga;}

    public void setNama(String nama) {this.nama = nama;}
    public void setHarga(int harga) {this.harga = harga;}

    public void display(){
        System.out.println("Nama Produk\t\t: " + getNama());
    }
}
