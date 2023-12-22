import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
	
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for(int i=0;i<N;i++) {
			if(array.contains(A[i])) {
				array.remove(array.indexOf(A[i]));
			}
			else {
				array.add(A[i]);
			}
		}
		
		System.out.println(array.size());
		

	}
}
