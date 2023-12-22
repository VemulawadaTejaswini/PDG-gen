import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] L = new int[87];
		L[0]=2;
		L[1]=1;
		for(int i=2; i<=86; i++) {
			L[i]=L[i-1]+L[i-2];
		}
		int N = sc.nextInt();
		System.out.println(L[N]);

	}

}
