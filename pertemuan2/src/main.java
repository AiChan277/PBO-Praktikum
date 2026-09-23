//Muhammad Haidar Ramzy - L0125109
public class main {

    public static void main(String[] args) {
        pemain messi = new pemain("messi", 36, false);
        pemain mbappe = new pemain("mbappe", 29, true);
        pemain ronaldo = new pemain("rolando", 38, true);

        sepatu nike = new sepatu("Nike", 42, 1000000);
        sepatu asics = new sepatu("Asics", 43, 800000);

        messi.pakaiSepatu(nike);
        messi.display();

        mbappe.pakaiSepatu(asics);
        mbappe.display();

        System.out.println("\nTotal pemain: " + pemain.totalPemain);
    }
}
