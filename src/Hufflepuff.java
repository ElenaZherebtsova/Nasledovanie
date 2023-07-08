public class Hufflepuff extends Hogwarts{

    private int trudolybie;
    private int vernost;
    private int chestnost;

    public Hufflepuff (String name, String surname, int koldovstvo, int transgressia,
                       int trudolybie, int vernost, int chestnost) {
        super(name, surname, koldovstvo, transgressia);
        this.trudolybie = trudolybie;
        this.vernost = vernost;
        this.chestnost = chestnost;

    }

    public int getTrudolybie() {return this.trudolybie;}
    public int getVernost() {return this.vernost;}
    public int getChestnost() {return this.chestnost;}


}
