public class Main
{
    public static void main(String[] args) {
        new ThreadTest("Google").start();
        new ThreadTest("Yahoo").start();
        new ThreadTest("Bing").start();
    } 
}