import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int NN = N;
		int SN = 0;

		while(NN > 0) {
			SN += NN%10;
			NN = NN/10;
		}
		//System.out.println(SN);

		if(N%SN == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
