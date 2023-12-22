import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		int firstA1 = sc.nextInt();
		int firstA2 = sc.nextInt();
		int count = 0;
		
		if(firstA1 == firstA2){
			System.out.println(N/2);
			System.exit(0);
		}
		
		for(int i = 0; i < (N-2)/2; i++){
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			
			if(firstA1 != a1){
				count++;
			}
			if(firstA2 != a2){
				count++;
			}
		}
		System.out.println(count);
		
	}
}
