package JAVA15;


class CTest extends Thread
{
	String id;
	public CTest(String str)
	{
		id=str;
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<100000000;j++);
			System.out.println(id+" "+i);
			
		}
	}
}
public class hw15_4 {

	public static void main(String[] args) {
		CTest hi = new CTest("Hello");
		CTest bye = new CTest("Good bye");
		CTest morning = new CTest("Good morning");
		hi.start();
		bye.start();
		morning.start();

	}

}