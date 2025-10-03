package hybrid_inheritance;
class Programmer extends Pekerja implements Aktif {
    @Override
    public void beraktivitas() {
        System.out.println("Programmer sedang coding.");
    }
    
    void membuatAplikasi() {
        System.out.println("Programmer membuat aplikasi.");
    }
}