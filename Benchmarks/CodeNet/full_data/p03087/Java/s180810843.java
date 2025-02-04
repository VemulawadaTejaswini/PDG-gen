import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		solve_2020_0217_003();
	}


	public static void solve_2020_0217_003(){

		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		String kw = "AC";

		int[] l = new int[Q];
		int[] r = new int[Q];

		for(int i=0;i<Q;i++){
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}

		//cumulative sum

		int[] cs = new int[N+1];
		cs[0] = 0;

		for(int i=1;i<N;i++){

			int cs_tmp = 0;

			if(S.substring(i-1, i+1).equals(kw)){
				cs_tmp = 1;
			}

			cs[i] = cs[i-1] + cs_tmp;
		}

		//cs[r-1] - cs[l-1]
		for(int i=0;i<Q;i++){

			if( (r[i]==0) || (r[i]-l[i]<2) ){
				System.out.println("0");
			}
			else{
				int ans = cs[r[i]-1] - cs[l[i]-1];
				System.out.println(ans);
			}
		}
    }
}