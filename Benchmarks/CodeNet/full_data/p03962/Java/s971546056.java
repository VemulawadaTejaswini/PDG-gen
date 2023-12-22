import java.util.*;
 
public class Main{
 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int total=0;
		
		if(a==b||a==c||b==c) total=2;
		if(a==b&&a==c&&b==c) total=1;
		else total=3;
		System.out.println(total);
	}
}