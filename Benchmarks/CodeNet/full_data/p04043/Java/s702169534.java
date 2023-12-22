
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int[]n=new int [3];
	int sum5=0; int sum7=0;
	for (int i = 0; i < n.length; i++) {
		int a= input.nextInt();
		n[i]=a;
		if(n[i]==5) sum5++;
		else if (n[i]==7) sum7++;	
	}
	if (sum5==2&& sum7==1)
		System.out.println("Yes");
	else System.out.println("No");
}}
