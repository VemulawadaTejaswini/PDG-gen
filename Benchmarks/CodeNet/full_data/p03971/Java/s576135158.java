import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);	
		
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum = a + b;
		
		String s = scan.next();
		
		for(int i = 0 ;  i < n ; i++){
			
			if(s.charAt(i) == 'a'){
				if(sum > 0){
					System.out.println("Yes");
					sum--;
					if(a == 0){
						b--;
					} else {
						a--;
					}
					
				} else {
					System.out.println("No");
				}
			} else if(s.charAt(i) == 'b'){
				if(b > 0){
					System.out.println("Yes");
					b--;
					sum--;
				} else {
					System.out.println("No");
				}
			} else {
				System.out.println("No");
			}
		}
	}
}
