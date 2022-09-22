public class App extends Thread{
    public void run(){
        System.out.println("Child Thread is running");
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        App t = new App();
        t.start();
    }
}
