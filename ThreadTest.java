public class ThreadTest extends Thread
{
    public ThreadTest(String str)
    {
        super(str);
    }
    
    public void run()
    {
        for (int i = 1; i < 101; i++) {
            System.out.println("Loop " + i + ": " + getName());
            try {
                sleep((int) (Math.random() * 2000));
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Test Finished for: " + getName());
    }
}