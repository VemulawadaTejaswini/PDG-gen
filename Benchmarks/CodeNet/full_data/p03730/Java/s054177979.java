import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		a = a % b;
		
		wihle(true){
			
			if(c == 0){
				System.out.println("NO");
				break;
			}

			a = a - c;
			
			if(a == 0){
				System.out.println("YES");
				break;
			} else if(a < 0){
				System.out.println("NO");
				break;
			}
		}
	}
}