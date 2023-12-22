import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int k = scan.nextInt();
		int x = scan.nextInt();

		for(int i=x-k+1;i<k+x;i++) {
			if(i < k+x-1) {
			System.out.println(i+" ");
			}else {
				System.out.println(i);
			}
		}
		scan.close();
	}

}
