public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


    }

    public static Hogwarts students() {

        Gryffindor garryPotter = new Gryffindor("Гарри", "Поттер", 86, 74, 59, 40, 99);
        Gryffindor germionaGreindger = new Gryffindor("Гермиона", "Грейнджер", 95, 59, 86, 64, 82);
        Gryffindor ronUizely = new Gryffindor("Рон", "Уизли", 42, 37, 66, 70, 69);
        return garryPotter;
        return germionaGreindger;
        return ronUizely;

        Slytherin dracoMalfoy = new Slytherin("Драко", "Малфой", 73, 44, 95, 82, 97, 89);
        Slytherin grehemMontegy = new Slytherin("Грэхэм", "Монтегю", 38, 54, 39, 61, 18, 58);
        Slytherin gregoryGoil = new Slytherin("Грегори", "Гойл", 28, 22, 46, 30, 61, 38);
        return dracoMalfoy;
        return gregoryGoil;
        return grehemMontegy;

        Hufflepuff zaharyaSmith = new Hufflepuff("Захария", "Смит", 18, 26, 45, 36, 14);
        Hufflepuff sedrikDiggori = new Hufflepuff("Седрик", "Диггори", 75, 62, 44, 73, 58);
        Hufflepuff dgastinFinchFletch = new Hufflepuff("Джастин", "Финч-Флетч", 50, 46, 63, 68, 35);
        return zaharyaSmith;
        return sedrikDiggori;
        return dgastinFinchFletch;

        Ravenclaw jouChang = new Ravenclaw("Джоу", "Чанг", 42, 58, 76, 83, 40, 57);
        Ravenclaw padmaPatil = new Ravenclaw("Падма", "Патил", 20, 35, 64, 49, 67, 88);
        Ravenclaw marcusBelbi = new Ravenclaw("Маркус", "Белби", 58, 47, 84, 62, 90, 87);
        return jouChang;
        return padmaPatil;
        return marcusBelbi;
    }

    public static void printStudents() {

    }

}