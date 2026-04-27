class Bomb extends Thread {
    public Bomb(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + ": " + i);
        }
        System.out.println(getName() + " exploded!");
    }
}

public class ConcurrentDemo {
    public static void main(String[] args) {
        Bomb a = new Bomb("Bomb A");
        Bomb b = new Bomb("Bomb B");

        a.start();
        b.start();
    }
}
