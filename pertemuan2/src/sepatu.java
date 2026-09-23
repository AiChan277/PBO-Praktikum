//Muhammad Haidar Ramzy - L0125109

public class sepatu {
    String merk;
    int ukuran;
    float harga;

    sepatu(String merk, int ukuran, float harga){
        this.merk = merk;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    void display(){
        System.out.println("Sepatu Merk: " + merk);
        System.out.println("Sepatu Ukuran: " + ukuran);
        System.out.println("Sepatu Harga: Rp " + harga);
    }
}
