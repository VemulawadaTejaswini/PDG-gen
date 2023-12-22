import java.util.*;
 
public class Main{
 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int total=3;
		
		if(a==b) total--;
		if(b==c) total--;
		if(a==c) total--;
		System.out.println(total);
	}
}