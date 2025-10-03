package multi_inheritance; 
public class Main {
    public static void main(String[] args) {
        Kucing kitty = new Kucing();
        kitty.makan();    // Dari Hewan
        kitty.menyusui(); // Dari Mamalia
        kitty.mengeong(); // Dari Kucing
    }
}