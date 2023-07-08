public class Gryffindor extends Hogwarts {
    private int blagorodstvo;
    private int chest;
    private int hrabrost;

    public Gryffindor(String name, String surname, int koldovstvo, int transgressia,
                      int blagorodstvo, int chest, int hrabrost) {
        super(name, surname, koldovstvo, transgressia);
        this.blagorodstvo = blagorodstvo;
        this.chest = chest;
        this.hrabrost = hrabrost;
    }

    public int getBlagorodstvo() {
        return this.blagorodstvo;
    }

    public int getChest() {
        return this.chest;
    }

    public int getHrabrost() {
        return this.hrabrost;
    }

    public String toString() {
        return this.getName() + this.getSurname() + this.blagorodstvo + this.chest + this.hrabrost;
    }

}
