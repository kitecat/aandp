public class People {
    protected String name;
    protected String lastname;
    protected int age;

    People(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public void walk() {
        System.out.println("I am walk");
    }

    public void voice() {
        System.out.println("I am say");
    }

    public void run() {
        System.out.println("I am run");
    }
}
