class Bomb {
    private String name;

    public Bomb(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + ": " + i);
        }
        System.out.println(name + " exploded!");
    }
}

public class SequentialDemo {
    public static void main(String[] args) {
        Bomb a = new Bomb("Bomb A");
        Bomb b = new Bomb("Bomb B");

        a.run();  // runs first
        b.run();  // runs after A finishes
    }
}
