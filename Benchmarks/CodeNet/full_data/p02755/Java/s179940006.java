import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int s = -1;
		//s*0.08=A && s*0.1=B
		for(int i=1; i<=1009; i++) {
			if((int)(i*0.08)==A && (int)(i*0.1)==B) {
				s = i;
			}
		}
		System.out.println(s);
	}

}