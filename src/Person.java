/**
 * Created by kobis on 27 Nov, 2022
 */

public class Person {
    private int id;
    private String name;
    private int age;
    private double runKmPerWeek;

    public Person(int id, String name, int age, double runKmPerWeek) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.runKmPerWeek = runKmPerWeek;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getRunKmPerWeek() {
        return runKmPerWeek;
    }

    public void setRunKmPerWeek(double runKmPerWeek) {
        this.runKmPerWeek = runKmPerWeek;
    }

    @Override
    public String toString() {
        return getClass().getName() + " {\n\tid: " + id + "\n\tname: " + name + "\n\tage: " + age + "\n\ttimeToLive: "
                + runKmPerWeek + "\n}";
    }

}