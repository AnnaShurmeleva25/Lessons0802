package studentstask;

public class Student extends Man{
    private int graduate;

    public Student(String name, int age, Sex sex, double weight, int graduate){
        super(name, age, sex, weight);
        this.graduate = graduate;
    }
    public void levelUp(){
        this.graduate++;
    }

    @Override
    public String toString() {
        return super.toString() + " graduate: " + graduate;
    }
}
