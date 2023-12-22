import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A % 2 == 1 && B % 2 == 1){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}
