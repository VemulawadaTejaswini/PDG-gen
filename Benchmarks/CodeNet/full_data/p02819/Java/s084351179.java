import java.util.Scanner;

public class Main {
	static boolean isPrime(int X){
		if(X == 1)return false;
		if(X == 2)return true;
		for(int i = 2 ; i * i <= X ; ++i){
			if(X % i == 0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		for(int i = X ; ; ++i){
			if(isPrime(i)){
				System.out.println(i);
				break;
			}
		}
	}
}
