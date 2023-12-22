import java.util.ArrayList;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		long n = Long.parseLong(scn.next());
		long m = Long.parseLong(scn.next());

		ArrayList<Integer>[] input = new ArrayList[(int)n];

		for(int i=0;i<n;i++){
			input[i] = new ArrayList<Integer>();
		}

		for(int i=0;i<m;i++){
			int a = scn.nextInt() - 1;
			int b = scn.nextInt() - 1;

			input[a].add(b);
			input[b].add(a);
		}


		boolean[] flag = new boolean[(int)n];
		int count = solve(input,flag, 0);
		System.out.println(count);

	}

	public static int solve(ArrayList<Integer>[] input,boolean[] flag, int I){
		//訪問した
		flag[I] = true;

		int sum = 0;

		//終了条件
		boolean f = true;
		//全て通ったか
		for(int i=0;i<flag.length;i++){
			if(flag[i] == false){
				f = false;
			}
		}
		if(f){
			sum++;
		}


		for(int i=0;i<input[I].size();i++){
			int next = input[I].get(i);
			if(flag[next] == false){
				sum += solve(input, flag,next);
			}
		}

		//訪問し終わった。
		flag[I] = false;

		return sum;
	}
}