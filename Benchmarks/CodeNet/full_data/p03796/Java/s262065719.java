import java.util.Scanner;

public class Main {
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	int N = scanner.nextInt();
	int power = 1;
	for(int i = 1;i <= N;i++)power*=i;
	System.out.println((int)(power % (Math.pow(10,9)+7)));
	}
}
