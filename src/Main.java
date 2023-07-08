public class Main {

    public static void main(String[] args) {
                System.out.println("ХОГВАРТС:");



        Hogwarts[] students = {

        new Gryffindor("Гарри", "Поттер", 86, 74, 59, 40, 99),
        new Gryffindor("Гермиона", "Грейнджер", 95, 59, 86, 64, 82),
        new Gryffindor("Рон", "Уизли", 42, 37, 66, 70, 69),

        new Slytherin("Драко", "Малфой", 73, 44, 95, 82, 97, 89),
        new Slytherin("Грэхэм", "Монтегю", 38, 54, 39, 61, 18, 58),
        new Slytherin("Грегори", "Гойл", 28, 22, 46, 30, 61, 38),

        new Hufflepuff("Захария", "Смит", 18, 26, 45, 36, 14),
        new Hufflepuff("Седрик", "Диггори", 75, 62, 44, 73, 58),
        new Hufflepuff("Джастин", "Финч-Флетч", 50, 46, 63, 68, 35),

        new Ravenclaw("Джоу", "Чанг", 42, 58, 76, 83, 40, 57),
        new Ravenclaw("Падма", "Патил", 20, 35, 64, 49, 67, 88),
        new Ravenclaw("Маркус", "Белби", 58, 47, 84, 62, 90, 87),
        };

        System.out.println("Количество учеников = " + students.length);
        printStudents(students);
    }

    public static void printStudents(Hogwarts[] students) {
        for (int i = 0; i < students.length; i++) {
            Hogwarts student = students[i];
            System.out.println(student.getName() + " " + student.getSurname());
            System.out.println("Качества: колдовство = " + student.getKoldovstvo() +
                    ", трансгрессия = " + student.getTransgressia());
        }
    }

    public static void sravnenieKachestv(Hogwarts[] students) {

    }


}