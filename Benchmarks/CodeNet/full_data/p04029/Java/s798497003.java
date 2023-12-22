import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt(), sum=0;
		for(int i=1; i<=t; ++i) sum+=i;
		System.out.println(sum);
		sc.close(); 
	}

}
