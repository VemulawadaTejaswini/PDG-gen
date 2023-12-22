import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int[] A = new int[N];
		double d = 0;
		for(int i = 0;i < N;i++){
			A[i] = Integer.parseInt(sc.next());
			d += 1/(double)A[i];
		}
		sc.close();
		System.out.println(1/d);
	}
}