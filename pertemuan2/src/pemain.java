//Muhammad Haidar Ramzy - L0125109

public class pemain {
    String nama;
    int umur;
    boolean aktifMain;

    sepatu sepatu;

    static int totalPemain;

    pemain(String nama, int umur, boolean aktifMain){
        this.nama = nama;
        this.umur = umur;
        this.aktifMain = aktifMain;
        totalPemain++;
    }

    void pakaiSepatu(sepatu sepatu){
        this.sepatu = sepatu;
    }

    void display(){
        System.out.println("Nama Pemain: " + nama);
        System.out.println("Umur Pemain: " + umur);
        System.out.println("Aktif Main: " + (this.aktifMain ? "Ya" : "Tidak"));
    }
    public static void main(String[] args) {
        
    }
}
