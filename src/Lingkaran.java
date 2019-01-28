public class Lingkaran {
    private final double pi = 3.14;
    private int radius;
    private double keliling;

    public void HitungKelilingLingkaran(){
        this.keliling = 2 * pi * radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public double getKelilingLingkaran(){
        return keliling;
    }
}
