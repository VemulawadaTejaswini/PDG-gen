import java.util.Scanner;
 
public class Main {
	public static int maxDepth;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String head = "ABD";
		if (n <= 999)
			head = "ABC";
			
		System.out.println(head);
	}
}