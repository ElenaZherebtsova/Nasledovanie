public abstract class Hogwarts {

    private String name;
    private String surname;
    private int koldovstvo;
    private int transgressia;


    public Hogwarts(String name, String surname, int koldovstvo, int transgressia) {
        this.name = name;
        this.surname = surname;
        this.koldovstvo = koldovstvo;
        this.transgressia = transgressia;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getKoldovstvo() {
        return this.koldovstvo;
    }

    public int getTransgressia() {
        return this.transgressia;
    }

    @Override
    public String toString() {
        return " name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", koldovstvo=" + koldovstvo +
                ", transgressia=" + transgressia +
                ',';
    }

    public void sravnenie(Hogwarts other) {
        int count1 = this.koldovstvo + this.transgressia;
        int count2 = other.koldovstvo + other.transgressia;
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
