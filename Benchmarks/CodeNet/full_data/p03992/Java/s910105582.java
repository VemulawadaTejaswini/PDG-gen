import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		String a= sc.next();
		
		String b="";
		
		
		for(int i=0;i<4;i++)
		{	
			 b=b+a.charAt(i);
		}
		b=b+" ";
		for(int i=4;i<a.length();i++)
		{	
			 b=b+a.charAt(i);
		}
		System.out.println(b);
		sc.close();
			
	}

}
