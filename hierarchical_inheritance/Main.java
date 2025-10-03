package hierarchical_inheritance;
public class Main {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran();
        Persegi p = new Persegi();

        l.display(); // Dari Bentuk
        p.display(); // Dari Bentuk

        l.hitungLuas();
        p.hitungLuas();
    }
}