import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		String[] S=sc.next().split("");
		int K=sc.nextInt();
		String s_vlaue=S[K-1];
		String result="";

		for(int i=0;i<S.length;i++) {
			if(!S[i].equals(s_vlaue)) S[i]="*";
		}
		for(int i=0;i<S.length;i++) {
			System.out.print(S[i]);
		}
    }
}