package cont;

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int n;
	n = input.nextInt();
	int sum =0;
	for (int i=0;i<=n;i++)
		sum+= i;
		System.out.println(sum);
	

}
}
