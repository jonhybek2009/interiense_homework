public class Person {
    String name;
    String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    public void learn() {
        System.out.println(name + "  учиться.");
    }
    public void walk() {
        System.out.println(name + " ходит.");
    }
    public void eat() {
        System.out.println(name + " кушает.");
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Designation: " + designation;
    }
}



