package single_inheritance;
public class Main {
    public static void main(String[] args) {
        Mobil mobilSaya = new Mobil("Toyota", 100);
        mobilSaya.bergerak(); // Metode dari Kendaraan
        mobilSaya.klakson();  // Metode dari Mobil
    }
}