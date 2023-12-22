import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		
		int count = (b/x) - (a/x);
		if(a%x == 0) {
			count++;
		}
		
		System.out.println(count);
			
		}
	}