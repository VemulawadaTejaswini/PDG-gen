import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		boolean doCount= true;
		int targetNum = 0;
		int count = 0;
		while(doCount) {
			targetNum++;
			if(a%targetNum ==0 && b%targetNum ==0) {
				count++;
				if(count == c) {
					doCount=false;
				}
			}
		}
		System.out.println(targetNum);
		sc.close();
	}
}



