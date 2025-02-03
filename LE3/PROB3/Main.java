public class Main {
    public static void main(String[] args) {
        // Create different types of ducks
        RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck = new WoodenDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        LakeDuck lakeDuck = new LakeDuck();

        // Demonstrating behaviors for Rubber Duck
        System.out.println("Rubber Duck's behavior:");
        rubberDuck.swim();
        rubberDuck.squeak();
        System.out.println();

        // Demonstrating behaviors for Wooden Duck
        System.out.println("Wooden Duck's behavior:");
        woodenDuck.swim();
        woodenDuck.mute();
        System.out.println();

        // Demonstrating behaviors for RedHead Duck
        System.out.println("RedHead Duck's behavior:");
        redHeadDuck.swim();
        redHeadDuck.fly();
        redHeadDuck.quack();
        System.out.println();

        // Demonstrating behaviors for Lake Duck
        System.out.println("Lake Duck's behavior:");
        lakeDuck.swim();
        lakeDuck.fly();
        lakeDuck.quack();
    }
}
