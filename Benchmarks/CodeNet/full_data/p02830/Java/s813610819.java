import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		String A = sc.next();
		String B = sc.next();

		String[] a_ = A.split("");
		String[] b_ = B.split("");

		ArrayList<String> aa= new ArrayList<String>();

		for(int i=0;i<N;i++){
			aa.add(a_[i]);
			aa.add(b_[i]);
		}
		sc.close();
		System.out.println(aa);
	}
}
