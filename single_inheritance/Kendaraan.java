package single_inheritance; 
class Kendaraan {
    int kecepatan;
    
    public Kendaraan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void bergerak() {
        System.out.println("Kendaraan bergerak dengan kecepatan " + kecepatan + " km/jam.");
    }
}

// Mobil.java (Sub-class)
class Mobil extends Kendaraan { // Single Inheritance
    String merek;

    public Mobil(String merek, int kecepatan) {
        super(kecepatan); // Memanggil konstruktor Super-class
        this.merek = merek;
    }

    public void klakson() {
        System.out.println(merek + " membunyikan klakson: 'Tin-tin!'");
    }
}