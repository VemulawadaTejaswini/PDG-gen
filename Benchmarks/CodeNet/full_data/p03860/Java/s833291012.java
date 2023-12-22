import java.util.Scanner;
 
public class Main{
 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a=sc.nextLine();
		String s=sc.nextLine();
		String c=sc.nextLine();
		System.out.println(a.substring(0,1)+s.substring(0,1)+c.substring(0,1));	
	}
}