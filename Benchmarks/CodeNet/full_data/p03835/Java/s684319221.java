import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int sum = scanner.nextInt();
		int count = 0;
		
		for(int i = 0; i<=n ; i++){
			for(int j = 0 ; j<=n ; j++){
				for(int k = 0 ; k<=n ; k++){
					if( (i+j+k)==sum ) count++;
				}
			}
		}
		
		System.out.println(count);
		
	}
}