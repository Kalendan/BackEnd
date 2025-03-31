package Lesson01;

    import java.util.Random;

    public class Runner implements Runnable {
        private String name;
        private Random random = new Random();

        public Runner(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            int distance = 0;

            while (!Race.raceOver && distance < 100) {
                int step = random.nextInt(10) + 1; // шаг от 1 до 10
                distance += step;

                System.out.println(name + " пробежал " + distance + " м");

                if (distance >= 100 && !Race.raceOver) {
                    Race.raceOver = true;
                    System.out.println(name + " победил!");
                    break;
                }

                try {
                    Thread.sleep(100 + random.nextInt(201)); // от 100 до 300 мс
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
    }


