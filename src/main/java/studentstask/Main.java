package studentstask;

public class Main {
    public static void main(String[] args) {
        Student dima = new Student("Dmitry", 35, Sex.MALE, 76, 2);
        Student ira = new Student("Irina", 30, Sex.FEMALE, 53, 2);

        dima.levelUp();
        ira.levelUp();
        System.out.println(dima);
        System.out.println(ira);
    }
}
