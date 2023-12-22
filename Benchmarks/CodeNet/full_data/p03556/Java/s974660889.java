import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int result = 0;
		for(int i=1;i<=n;i++){
			int x = i * i;
			if(x <= n){
				result = x;
			}
		}
		System.out.println(result);
	}

}
