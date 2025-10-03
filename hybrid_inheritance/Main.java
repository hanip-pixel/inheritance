package hybrid_inheritance;
public class Main {
    public static void main(String[] args) {
        Programmer prog = new Programmer();
        prog.bernafas();      // Dari MakhlukHidup (Level 1)
        prog.bekerja();       // Dari Pekerja (Level 2)
        prog.beraktivitas();  // Dari Interface Aktif
        prog.membuatAplikasi();
    }
}