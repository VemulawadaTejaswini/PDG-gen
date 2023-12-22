import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		double sum = 0;
		for (int i = 0; i <a; i++) {
			int ai = s.nextInt();
			double val = 1.0/ai;
			sum=sum+val; 
		}
		System.out.println(1/sum);

	}

}
