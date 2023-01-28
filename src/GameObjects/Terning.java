package GameObjects;

public class Terning {

    private int verdi;

    public Terning() {
        this.verdi = 0;
    }

    public int getVerdi() {
        return this.verdi;
    }

    public void kast() {
        this.verdi = (int) (Math.random() * 6) + 1;
    }

    public String toString() {
        return "Terning: " + this.verdi;
    }

    
}
