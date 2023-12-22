import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int numc = num;
		int sum = 0;
		for(int i = 0; i < String.valueOf(num).length(); i++) {
			sum = sum + numc % 10;
			numc = numc / 10;
		}
		if(num % sum == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
