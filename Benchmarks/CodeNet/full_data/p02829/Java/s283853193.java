import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// ABC 148
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		scan.close();
		for(int i=0;i<3;i++) {
			if(a!=i+1&&b!=i+1) {
				System.out.println(i+1);
				break;
			}
		}
	}

}