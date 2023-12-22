package abc108;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//偶数と奇数の組み合わせ(%2,%2+1)

		Scanner scanner=new Scanner(System.in);
		int K=scanner.nextInt();
		int kosuu=((K/2)*((K+1)/2));

		System.out.println(kosuu);
	}

}
