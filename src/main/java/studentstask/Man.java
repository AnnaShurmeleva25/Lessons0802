package studentstask;

public class Man {
    private String name;
    private int age;
    private Sex sex;
    private double weight;

    public Man(String name, int age, Sex sex, double weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return String.format(
                "name: %s, age: %s, sex: %s, weight: %s",
                this.name,
                this.age,
                this.sex,
                this.weight);
    }
}
