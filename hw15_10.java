package JAVA15;
//hw15_10,
class CTest implements Runnable
{
private String id;
public CTest(String str)
{
   id=str;
}
public void run()
{
   for(int i=1;i<=5;i++)
   {
      try
      {
         Thread.sleep((int)(2000*Math.random()));
      }
      catch(InterruptedException e){}
      System.out.println(id+" "+i);
   }
}
}

public class hw15_10
{
public static void main(String args[])
{
   CTest hi=new CTest("Hello");
   CTest bye=new CTest("Good bye");
   CTest morning=new CTest("Good morning");
   CTest night=new CTest("Good night");
   Thread t1=new Thread(hi);
   Thread t2=new Thread(bye);
   Thread t3=new Thread(morning);
   Thread t4=new Thread(night);
   t1.start();
   t2.start();
   t3.start();
   t4.start();
}
}

/* output--------------------
Hello 1
Good night 1
Good bye 1
Good morning 1
Hello 2
Good night 2
Hello 3
Good bye 2
Hello 4
Good night 3
Good night 4
Good morning 2
Good morning 3
Hello 5
Good bye 3
Good night 5
Good morning 4
Good bye 4
Good morning 5
Good bye 5
---------------------------*/
