import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int min=1000000000,max=0;
		for(int i=0; i<n; i++) {
			int s=sc.nextInt();
			if(min>s)min=s;
			if(max<s)max=s;
		}
		System.out.println(max-min);
	}
}
