import java.util.concurrent.locks.ReadWriteLock;

public class Ravenclaw extends Hogwarts{

    private int um;
    private int mudrost;
    private int ostroumie;
    private int tvorchestvo;

    public Ravenclaw (String name, String surname,
                      int koldovstvo, int transgressia,
                      int um, int mudrost, int ostroumie,
                      int tvorchestvo) {
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

    @Override
    public String toString() {
        return "Ravenclaw{" +
                super.toString() +
                " um=" + um +
                ", mudrost=" + mudrost +
                ", ostroumie=" + ostroumie +
                ", tvorchestvo=" + tvorchestvo +
                '}';
    }


    public void sravnenie(Ravenclaw other) {
        int count1 = this.um + this.mudrost +
                this.ostroumie + this.tvorchestvo;
        int count2 = other.um + other.mudrost +
                other.ostroumie + other.tvorchestvo;
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
