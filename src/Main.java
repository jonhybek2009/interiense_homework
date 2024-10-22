//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Жыргалбек", "Прогграимст", "Текнопарк коворкинг");
        Dancer dancer = new Dancer("Канур", "Танцор", "justDance");
        Singer singer = new Singer("Дима", "Певец", "Король и шут");

        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();

        System.out.println();

        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();

        System.out.println();

        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGuitar();
    }
}

