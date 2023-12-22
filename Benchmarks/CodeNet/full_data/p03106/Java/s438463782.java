import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
	
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int k = scanner.nextInt();
		int i=1;
		int time=0;
	
		while(k!=time) {
			if(a%i==0 && b%i==0) {
					time++;
			}
			if(k==time) { 
				System.out.println(i);
				break;
			}
			else i++;
		}
	}
}
