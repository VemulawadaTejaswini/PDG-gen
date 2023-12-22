import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		
		int A[] = new int[200200];
		
		int B[] = new int[200200];
		
		for(int i = 2;i<N+1;i++) A[i] = cin.nextInt();
		
		for(int i = 2;i<N+1;i++) B[A[i]]++;
		
		
		//社員番号1~Nのそれぞれの社員について、直属の部下が何人いるか出力
		for(int i = 1;i<N+1;i++) System.out.println(B[i]);

	}

}