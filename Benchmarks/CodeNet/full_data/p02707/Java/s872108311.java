import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A[] = new int[N+1];
		int answer[] = new int[N+1];
        //社員番号xの社員の直属の部下はA[i]=xを満たす。
        //つまり、各数がAに何度登場するかを求めればよい
		for(int i=2; i<=N; i++) {
			A[i] = sc.nextInt();
		}
		for(int i=2; i<=N;i++) {
			answer[A[i]]++;
		}
		for(int i=1; i<=N; i++) {
			System.out.println(answer[i]);
		}
	}		
}