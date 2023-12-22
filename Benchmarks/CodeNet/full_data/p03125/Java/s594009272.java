import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int numA = scanner.nextInt();
		int numB = scanner.nextInt();
		int ans;
		if(numB % numA ==0){
			ans = numA + numB;
		}else{
			ans = numB - numA;
		}
		System.out.println(ans);
		scanner.close();
	}
	
}
