package javaapplication7;

class Hi implements Runnable {

    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}
