public class Hogwarts {

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

    public String toString() {
        return this.name + this.surname + this.koldovstvo + this.transgressia;
    }


}
