import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		solve_abc150_c();
	}
  
 	public static void solve_abc150_c(){

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		StringBuilder P = new StringBuilder();
		StringBuilder Q = new StringBuilder();

		for(int i=0;i<N;i++){
			P.append(sc.next());
		}

		for(int i=0;i<N;i++){
			Q.append(sc.next());
		}

		StringBuilder in	= new StringBuilder();
		String ans	= "";

		for(int i=1;i<=N;i++){
			in.append(i);
		}

		List<String> perm = new ArrayList<String>();
		//System.out.println(in.toString());

		solve_abc150_c_permutation(in.toString(), ans, perm);
		Collections.sort(perm);
		String Ps = P.toString();
		String Qs = Q.toString();
		int a = -1;
		int b = -1;

		for(int i=0;i<perm.size();i++){
			
			String tmp = perm.get(i);

			if(tmp.equals(Ps)){
				a = i;
			}
			
			if(tmp.equals(Qs)){
				b = i;
			}
		}

		System.out.println(Math.abs(a - b));

		sc.close();

	}

	public static void solve_abc150_c_permutation(String in, String ans, List<String> permutation){

		//if q.length <= 1
		if(in.length() <= 1){

			//return ans + q
			permutation.add(ans + in);
			//System.out.println(ans + in);
		}
		else{
			//for i=0~q.length-1
			for(int i=0;i<in.length();i++){
				//order(q.substring(0~i-1) + q.substring(i+1~end), ans + q.charAt(i))
				solve_abc150_c_permutation(in.substring(0,i) + in.substring(i+1), ans + in.charAt(i) , permutation);
			}
		}
	}
}