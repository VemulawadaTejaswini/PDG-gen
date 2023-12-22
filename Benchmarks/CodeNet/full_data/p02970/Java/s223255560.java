import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int D = scan.nextInt();
		int b = N;
		int count=0;
		for(int i=1;b>0;i++) {
			if(i-D>=0) {
				b = b - ((i+D)-(i-D)+1);
				count++;
			}
		}
		System.out.println(count);
	}

}