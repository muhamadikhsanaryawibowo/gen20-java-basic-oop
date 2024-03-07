
public class Main {
    public static void main(String[] args) {

        Minuman minuman1 = new Minuman("LeMinerale", 5000, "Minuman");
        Makanan makanan1 = new Makanan("Chitato", 10000, "Makanan");
        Obat obat1 = new Obat("Paracetamol", 12000, "Obat");

        Produk[] kumpulanProduk = new Produk[3];
        kumpulanProduk[0] = minuman1;
        kumpulanProduk[1] = makanan1;
        kumpulanProduk[2] = obat1;


        System.out.println("\nInformasi produk");
        for(Produk dispProduk: kumpulanProduk){
            dispProduk.display();
        }


    }
}
