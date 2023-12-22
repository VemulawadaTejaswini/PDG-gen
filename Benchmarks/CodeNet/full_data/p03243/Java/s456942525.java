import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String temp = String.valueOf(n/100);
		int tem = Integer.parseInt(temp+temp+temp);
		if (n <= tem) {
			System.out.println(tem);
		} else {
			System.out.println(tem+111);
		}
	}
}
