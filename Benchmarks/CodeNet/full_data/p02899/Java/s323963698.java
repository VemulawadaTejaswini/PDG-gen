
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		scan.nextLine();


		List<Integer> list = new ArrayList<Integer>(10000);

		for (int i=0; i<N; i++) {

		   int hi =	scan.nextInt();
		   list.add(hi);

		}


		for(int j=1; j<=N; j++) {


			int cnt =  1 + list.indexOf(j);
			System.out.print(cnt + " ");

		}

	}
}

