package JAVA15;

//hw15_14,
class PrePaid extends Thread
{
private static int sum=200;

public void run()
{
   int fee;
   while(sum>10)
   {
      fee=(int)(100*Math.random());
      talk(fee);
   }
}
public synchronized static void talk(int n)
{
   int tmp=sum-n;
   try
   {
      sleep((int)(1000*Math.random()));
   }
   catch(InterruptedException e){}
   if(tmp>0)
   {
      sum=tmp;
      System.out.println("通話費"+n+"元，餘額為"+sum+"元");
   }
}
}

public class hw15_14
{
public static void main(String args[])
{
   PrePaid phone1=new PrePaid();
   PrePaid phone2=new PrePaid();
   PrePaid phone3=new PrePaid();
   phone1.start();
   phone2.start();
   phone3.start();
}
}

/* output--------------------
通話費91元，餘額為109元
通話費62元，餘額為47元
通話費22元，餘額為25元
通話費23元，餘額為2元
---------------------------*/