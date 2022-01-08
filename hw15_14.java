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
      System.out.println("�q�ܶO"+n+"���A�l�B��"+sum+"��");
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
�q�ܶO91���A�l�B��109��
�q�ܶO62���A�l�B��47��
�q�ܶO22���A�l�B��25��
�q�ܶO23���A�l�B��2��
---------------------------*/