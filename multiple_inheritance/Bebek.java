package multiple_inheritance;
class Bebek implements BisaTerbang, BisaBerenang { // Multiple Inheritance of Type
    @Override
    public void terbang() {
        System.out.println("Bebek bisa terbang (dari Interface BisaTerbang).");
    }

    @Override
    public void berenang() {
        System.out.println("Bebek bisa berenang (dari Interface BisaBerenang).");
    }
}