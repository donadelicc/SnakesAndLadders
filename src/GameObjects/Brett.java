package GameObjects;

public class Brett {

    private int antallRuter;
    private int rad;
    private int kolonne;
    private int [][] heleBrettet;

    public Brett(int antallRuter, int rad, int kolonne) {
        this.antallRuter = antallRuter;
        this.rad = rad;
        this.kolonne = kolonne;
        this.heleBrettet = new int[rad][kolonne];
    }

    /* Getters and setters
       Probobly doesn't need all of them, but I'm not sure which ones I need 
     */ 

    public int getAntallRuter() {
        return this.antallRuter;
    }
    public void setAntallRuter(int antallRuter) {
        this.antallRuter = antallRuter;
    }
    public int [][] getHeleBrettet() {
        return this.heleBrettet;
    }
    public void setHeleBrettet(int [][] heleBrettet) {
        this.heleBrettet = heleBrettet;
    }
    public int getRad() {
        return this.rad;
    }
    public void setRad(int rad) {
        this.rad = rad;
    }
    public int getKolonne() {
        return this.kolonne;
    }
    public void setKolonne(int kolonne) {
        this.kolonne = kolonne;
    }



    public void lagBrett() {
        for (int i = 0; i < this.heleBrettet.length; i++) {
            for (int j = 0; j < this.heleBrettet[i].length; j++) {
                this.heleBrettet[i][j] = 0;
            }
        }
    }

    public void printBrett() {
        for (int i = 0; i < this.heleBrettet.length; i++) {
            for (int j = 0; j < this.heleBrettet[i].length; j++) {
                System.out.print(this.heleBrettet[i][j] + " ");
            }
            System.out.println();
        }
    }









    public String toString() {
        return "Brett: " + this.antallRuter;
    }
    
}
