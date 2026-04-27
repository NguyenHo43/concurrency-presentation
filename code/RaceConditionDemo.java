class Bomb extends Thread {
    static int count = 0; // shared variable

    public Bomb(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            count++; // NOT atomic (race condition here)
            System.out.println(getName() + ": " + count);

            try {
                Thread.sleep(50); // slow down to see issue clearly
            } catch (InterruptedException e) {}
        }
    }
}

public class RaceConditionDemo {
    public static void main(String[] args) {
        Bomb a = new Bomb("Bomb A");
        Bomb b = new Bomb("Bomb B");

        a.start();
        b.start();
    }
}
