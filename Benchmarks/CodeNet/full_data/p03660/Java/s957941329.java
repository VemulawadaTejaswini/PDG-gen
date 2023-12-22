import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main{

	static int N;
	static int M;
	static 		ArrayList<ArrayList<Integer>> map;
	static boolean[] used;
	static int f = 0;
	static int s = 0;




	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		N = sc.nextInt();
		long sum = 0;


		map = new ArrayList<ArrayList<Integer>>();
		for(int i = 0;i <= N;i++){
			ArrayList<Integer> x = new ArrayList<Integer>();
			x.add(0);
			map.add(x);
		}

		for(int i = 0;i < N-1;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			map.get(a).add(b);
			map.get(b).add(a);

		}
		used = new boolean[N+1];

		used[1] = true;
		used[N] = true;
		dfsf(1);

		Arrays.fill(used, false);
		used[1] = true;
		used[N] = true;
		dfss(N);

		if(f > s){
			System.out.println("Fennec");
		}else if(f % 2==1){
			System.out.println("Fennec");
		}else{
			System.out.println("Snuke");
		}

	}




	static void dfsf(int p){


		for(int i = 0;i < map.get(p).size();i++){
			int nextp = map.get(p).get(i);
			if(!used[nextp] && nextp != 0){
				used[nextp] = true;
				f++;
				dfsf(nextp);
				used[nextp] = false;
			}				
		}				
		return;


	}





	static void dfss(int p){

		for(int i = 0;i < map.get(p).size();i++){
			int nextp = map.get(p).get(i);
			if(!used[nextp] && nextp != 0){
				used[nextp] = true;
				s++;
				dfss(nextp);
				used[nextp] = false;
			}				
		}				
		return;




	}



}


