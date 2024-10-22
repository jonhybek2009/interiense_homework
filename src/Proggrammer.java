class Programmer extends Person {
    String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public void coding() {
        System.out.println(name + " пишет код.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Компания: " + companyName;
    }
}

