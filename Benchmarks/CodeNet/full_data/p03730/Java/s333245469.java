import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		a = a % b;
		
		while(true){
			
			if(c == 0){
				System.out.println("NO");
				break;
			}

			b = b - a;
			
			if(b == 0){
				System.out.println("YES");
				break;
			} else if(b < 0){
				System.out.println("NO");
				break;
			}
		}
	}
}
