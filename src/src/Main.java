public class Main {

    public static void main(String[] args) {
        People man = new People("Герман", "Игнатов", 33);
        Student student = new Student("Иван", "Иванов", 19);
        Teacher teacher = new Teacher("Олег", "Попов", 45);

        man.run();
        man.voice();
        man.walk();

        student.learn();

        teacher.teach();
    }
}
