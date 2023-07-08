public class Slytherin extends Hogwarts {

    private int hitrost;
    private int reshitelnost;
    private int ambicioznost;
    private int nahodchivost;
    private int vlast;

    public Slytherin (String name, String surname, int koldovstvo, int transgressia,
                     int hitrost, int reshitelnost, int ambicioznost, int vlast) {
        super(name, surname, koldovstvo, transgressia);
        this.hitrost = hitrost;
        this.reshitelnost = reshitelnost;
        this.ambicioznost = ambicioznost;
        this.nahodchivost = nahodchivost;
        this.vlast = vlast;
    }

    public int getHitrost() {
        return this.hitrost;
    }
    public int getReshitelnost() {
        return this.reshitelnost;
    }
    public int getAmbicioznost() {
        return this.ambicioznost;
    }
    public int getNahodchivost() {
        return this.nahodchivost;
    }
    public int getVlast() {
        return this.vlast;
    }


}
