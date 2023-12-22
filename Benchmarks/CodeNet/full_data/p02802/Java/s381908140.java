import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		solve_abc151_c();
	}
  	public static void solve_abc151_c(){

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] pi = new int[M];
		boolean[] p_ac = new boolean[N];

		int ans_correct = 0;
		int ans_penalty = 0;
		int[] p_penalty = new int[N];


		for(int i=0;i<M;i++){

			pi[i] = sc.nextInt() - 1;
			String s = sc.next();

			if(!p_ac[pi[i]]){

				if(s.equals("AC")){

					ans_correct++;
					p_ac[pi[i]] = true;
					ans_penalty += p_penalty[pi[i]];
				}
				else{
					p_penalty[pi[i]]++;
				}
			}
		}

		System.out.println(ans_correct + " " + ans_penalty);


		sc.close();
	}
}