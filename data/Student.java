package data;

public class Student extends User {
    private String direction;

    public Student(String name, int age, String direction) {
        super(name, age);
        this.direction = direction;
    }

    public Student(String name, int age) {
        super(name, age);
    }
    public Student(){

    }

    public String getDirection() {
        return direction;
        }

        @Override
    public String toString() {
        return "Student{" +
                "direction ='" + direction + '\'' +
                ", name ='" + name + '\'' +
                ", age =" + age +
                '}';
    }

}
