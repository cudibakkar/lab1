package tr.edu.maltepe.oop;

public class student {private String name;
    private int age;

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayImAStudent() {
        System.out.println("I'm a student.");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
