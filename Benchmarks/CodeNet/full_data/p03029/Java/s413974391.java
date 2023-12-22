import java.util.Arrays;
import java.util.Scanner;

public class ABC128B {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String[] S = new String[N];
		int[] P = new int[N];
		String[] sp = new String[N];
		for(int i=0;i<N;i++){
			S[i]=sc.next();
			P[i]=sc.nextInt();
			sp[i]=S[i]+"_"+(10100-P[i])+"_"+(i+1);
		}
		sc.close();

		Arrays.sort(sp);

		for(String s2:sp){
			String ans=s2.split("_")[2];
			System.out.println(ans);
		}

	}

}