package JAVA15;


//hw15_9,
class CTest extends Thread implements Runnable
{
private String id;
private int sec;
public CTest(String str,int s)
{
   id=str;
   sec=s;
}
public void run()
{
   for(int i=0;i<10;i++)
   {
      try
      {
         sleep(sec);
      }
      catch(InterruptedException e){}
      System.out.println(id+" is running..");
   }
}
}

public class hw15_9
{
public static void main(String args[])
{
   CTest one=new CTest("Thread 1",1000);
   CTest two=new CTest("Thread 2",2500);
   Thread t1=new Thread(one);
   Thread t2=new Thread(two);
   t1.start();
   t2.start();
}
}

/* output--------------------
Thread 1 is running..
Thread 1 is running..
Thread 2 is running..
Thread 1 is running..
Thread 1 is running..
Thread 2 is running..
Thread 1 is running..
Thread 1 is running..
Thread 1 is running..
Thread 2 is running..
Thread 1 is running..
Thread 1 is running..
Thread 2 is running..
Thread 1 is running..
Thread 2 is running..
Thread 2 is running..
Thread 2 is running..
Thread 2 is running..
Thread 2 is running..
Thread 2 is running..
---------------------------*/