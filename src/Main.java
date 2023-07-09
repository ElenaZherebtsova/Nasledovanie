public class Main {

    public static void main(String[] args) {
                System.out.println("ХОГВАРТС:");


      Gryffindor garry =   new Gryffindor("Гарри", "Поттер", 86, 74, 59, 40, 99);
      Gryffindor germiona =   new Gryffindor("Гермиона", "Грейнджер", 95, 59, 86, 64, 82);
      Gryffindor ron =   new Gryffindor("Рон", "Уизли", 42, 37, 66, 20, 49);

      Slytherin draco =   new Slytherin("Драко", "Малфой", 73, 44, 95, 82, 97, 89);
      Slytherin grehem =  new Slytherin("Грэхэм", "Монтегю", 38, 54, 39, 61, 18, 58);
      Slytherin gregory =   new Slytherin("Грегори", "Гойл", 28, 22, 46, 30, 61, 38);

      Hufflepuff zaharia =  new Hufflepuff("Захария", "Смит", 18, 26, 45, 36, 14);
      Hufflepuff sedrik =  new Hufflepuff("Седрик", "Диггори", 75, 62, 44, 73, 58);
      Hufflepuff jastin =  new Hufflepuff("Джастин", "Финч-Флетч", 50, 46, 63, 68, 35);

      Ravenclaw jou =  new Ravenclaw("Джоу", "Чанг", 95, 59, 76, 83, 40, 57);
      Ravenclaw padma =  new Ravenclaw("Падма", "Патил", 20, 35, 64, 49, 67, 88);
      Ravenclaw markus =  new Ravenclaw("Маркус", "Белби", 58, 47, 84, 62, 90, 87);

        System.out.println("germiona = " + germiona);
        System.out.println("padma = " + padma);
        System.out.println("gregory = " + gregory);
        System.out.println("sedrik = " + sedrik);


        garry.sravnenie(ron);
        garry.sravnenie(draco);
        germiona.sravnenie(jou);
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