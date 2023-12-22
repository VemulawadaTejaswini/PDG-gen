import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int A, B, C, mili=0;
		A = reader.nextInt();
		B = reader.nextInt();
		C = reader.nextInt();
		mili = (B+C)-A;
		if(mili>0) {
			System.out.println(mili);
		}else {
			System.out.println(0);
		}
	}

}
