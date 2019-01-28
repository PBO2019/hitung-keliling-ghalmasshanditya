public class Main {

    public static void main(String[] args) {
        Lingkaran bunder = new Lingkaran();
        BujurSangkar kotak = new BujurSangkar();

        bunder.setRadius(10);
        bunder.HitungKelilingLingkaran();
        System.out.println("Hasil dari keliling Lingkaran adalah      = " + bunder.getKelilingLingkaran());

        kotak.setSisi(10);
        kotak.hitungkelilingbujursangkar();
        System.out.println("\nHasil dari keliling Bujur Sangkar adalah  = " + kotak.getKelilingBujursangkar());
    }
}
