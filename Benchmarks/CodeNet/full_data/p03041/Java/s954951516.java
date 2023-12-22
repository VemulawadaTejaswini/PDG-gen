import java.util.Scanner;

public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String[] S = new String[N];
		for(int i = 0; i < N; i++){
			String word = sc.nextLine();
          	S[i] = word;
		}
		if(S[K-1] == "A"){
			S[K-1] = "a";
		}
		else if(S[K-1] == "B"){
			S[K-1] = "b";
		}
		else if(S[K-1] == "C"){
			S[K-1] = "c";
		}
	}
}