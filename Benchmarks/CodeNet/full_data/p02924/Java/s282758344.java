import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
int n = stdIn.nextInt();
		long max = 0;
		for(int i = 0; i < n; i++){
			max += i;
		
		}
		System.out.println(max);
    }
}