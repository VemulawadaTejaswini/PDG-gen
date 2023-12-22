import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		
		int a=tc.nextInt(), b=tc.nextInt(), c=0;
		if(a%b==0 || b%a==0) {c=a+b;}
		else {c=b-a;}
		System.out.println(c);
	
 
		
		// TODO Auto-generated method stub

	}

}
