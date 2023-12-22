import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		//A_i:出席番号iの生徒がきたときの教室の生徒の人数＝到着番号
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		sc.close();
		
		//B[]:到着した順番に出席番号が並んでる配列
		int[] B = new int[N];
		
		//出席番号順にfor文を回す。
		//つまり、Aを先頭から見る。
		for(int i=0;i<N;i++) {
			B[A[i]-1]=i+1;//到着番号、出席番号は1からなので配列の要素番号と１ずれてくる。
		}
		//B[]を先頭から出力すれば良い。
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			sb.append(B[i]);
			sb.append(" ");
		}
		String ans = sb.toString();
		
		System.out.println(ans);
		
	}
}
