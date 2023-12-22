import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		for(int a=0;a<=N;a++) {
			if(a*10000>Y) {
				break;
			}
			for(int b=0;b<=N;b++) {
				if((a*10000)+(b*5000)>Y) {
					break;
				}
					int c = N-(a+b);
					int sum = (10000*a)+(5000*b)+(1000*c);
					if(sum==Y) {
						System.out.println(a+" "+b+" "+c);
						System.exit(0);
					}
			}
		}
		System.out.print("-1 "+"-1 "+"-1");
	}
}