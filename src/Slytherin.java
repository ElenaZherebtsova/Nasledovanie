public class Slytherin extends Hogwarts {

    private int hitrost;
    private int reshitelnost;
    private int ambicioznost;
    private int nahodchivost;
    private int vlast;

    public Slytherin (String name, String surname,
                      int koldovstvo, int transgressia,
                     int hitrost, int reshitelnost,
                      int ambicioznost, int vlast) {
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

    @Override
    public String toString() {
        return "Slytherin{" +
                super.toString() +
                " hitrost=" + hitrost +
                ", reshitelnost=" + reshitelnost +
                ", ambicioznost=" + ambicioznost +
                ", nahodchivost=" + nahodchivost +
                ", vlast=" + vlast +
                '}';
    }

    public void sravnenie(Slytherin other) {
        int count1 = this.hitrost + this.reshitelnost +
                this.ambicioznost + this.nahodchivost +
                this.vlast;
        int count2 = other.hitrost + other.reshitelnost +
                other.ambicioznost + other.nahodchivost +
                other.vlast;
        if (count1 > count2) {
            System.out.println(this.getName() + " сильнее, чем " +
                    other.getName());
        } else if (count1 < count2) {
            System.out.println(other.getName() + " сильнее, чем " +
                    this.getName());
        } else {
            System.out.println("Студенты одинаково сильны: " + this.getName()
                    + " и " + other.getName());
        }
    }
}
