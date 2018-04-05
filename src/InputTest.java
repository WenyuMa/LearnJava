import java.util.*;

public class InputTest {
	public static void main(String[] args)
	{
		/*Scanner in=new Scanner(System.in);
		
		System.out.print("What is your name?");
		String name=in.nextLine();
		
		System.out.print("How old are you?");
		int age=in.nextInt();
		
		String message =String.format("Hello, %s. Next year you 'll br %d",name,age);
		*/
		//System.out.printf("%tc\n",new Date());
		System.out.printf("%1$s %2$tB %2$te, %2$tY", "Due date:", new Date());
	    System.out.printf("%s %tB %<te, %<tY", "Due date:", new Date());
		
		//System.out.println(message);
	}

}