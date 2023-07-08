public class Ravenclaw extends Hogwarts{

    private int um;
    private int mudrost;
    private int ostroumie;
    private int tvorchestvo;

    public Ravenclaw (String name, String surname, int koldovstvo, int transgressia, int um, int mudrost, int ostroumie, int tvorchestvo) {
        super(name, surname, koldovstvo, transgressia);
        this.um = um;
    this.mudrost = mudrost;
    this.ostroumie = ostroumie;
    this.tvorchestvo = tvorchestvo;
    }

    public int getUm() {return this.um;}
    public int getMudrost() {return this.mudrost;}
    public int getOstroumie() {return this.ostroumie;}
    public int getTvorchestvo() {return this.tvorchestvo;}

}
