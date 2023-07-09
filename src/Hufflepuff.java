public class Hufflepuff extends Hogwarts{

    private int trudolybie;
    private int vernost;
    private int chestnost;

    public Hufflepuff (String name, String surname,
                       int koldovstvo, int transgressia,
                       int trudolybie, int vernost,
                       int chestnost) {
        super(name, surname, koldovstvo, transgressia);
        this.trudolybie = trudolybie;
        this.vernost = vernost;
        this.chestnost = chestnost;

    }


    public int getTrudolybie() {return this.trudolybie;}
    public int getVernost() {return this.vernost;}
    public int getChestnost() {return this.chestnost;}

    @Override
    public String toString() {
        return "Hufflepuff{" +
                super.toString() +
                " trudolybie=" + trudolybie +
                ", vernost=" + vernost +
                ", chestnost=" + chestnost +
                '}';
    }



    public void sravnenie(Hufflepuff other) {
        int count1 = this.trudolybie + this.vernost +
                this.chestnost;
        int count2 = other.trudolybie + other.vernost +
                other.chestnost;
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
