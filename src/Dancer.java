class Dancer extends Person {
    String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public void dancing() {
        System.out.println(name + " is dancing.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Group: " + groupName;
    }
}

