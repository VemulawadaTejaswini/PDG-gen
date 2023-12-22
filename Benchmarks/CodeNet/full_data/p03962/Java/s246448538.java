import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int kind=3;
		
		if(a==b)kind--;
		if(a==c)kind--;
		
		System.out.print(kind);

	}

}