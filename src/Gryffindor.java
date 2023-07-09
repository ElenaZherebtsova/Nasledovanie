public class Gryffindor extends Hogwarts {
    private int blagorodstvo;
    private int chest;
    private int hrabrost;

    public Gryffindor(String name, String surname,
                      int koldovstvo, int transgressia,
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

    @Override
    public String toString() {
        return "Gryffindor{" +
                super.toString() +
                " blagorodstvo=" + blagorodstvo +
                ", chest=" + chest +
                ", hrabrost=" + hrabrost +
                '}';
    }


    public void sravnenie(Gryffindor other) {
        int count1 = this.blagorodstvo + this.hrabrost +
                this.chest;
        int count2 = other.blagorodstvo + other.hrabrost +
                other.chest;
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
