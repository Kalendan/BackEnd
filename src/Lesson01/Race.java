package Lesson01;


    public class Race {
    

            public static void main(String[] args) {
            Thread runner1 = new Thread(new Runner("Runner 1"));
            Thread runner2 = new Thread(new Runner("Runner 2"));

            System.out.println("Гонка начинается!");

            runner1.start();
            runner2.start();
        }
    }


