import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		int max = A + B;
		if(max < A - B)
			max = A ^ B;
		if(max < A * B)
			max = A * B;
		System.out.println(max);
	}
}
