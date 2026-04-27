class Bomb extends Thread {
    static int count = 0;

    public Bomb(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            increase();
        }
    }

    public synchronized void increase() {
        count++;
        System.out.println(getName() + ": " + count);
    }
}

public class SynchronizedDemo {
    public static void main(String[] args) {
        Bomb a = new Bomb("Bomb A");
        Bomb b = new Bomb("Bomb B");

        a.start();
        b.start();
    }
}
