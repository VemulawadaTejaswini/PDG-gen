

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for(int i = 1; i <= 9; i++){
			dfs(0, i);
		}

		int count = 0;
		while(!pq.isEmpty()){
//			System.out.print(pq.poll() + " ");
			if(pq.poll() <= n){
				count++;
			}
			else {
				break;
			}
		}

		System.out.println(count);


	}

	static int digits[] = new int[10];
	static PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

	static void dfs(int depth, int n){
		String tmp = "";

		if(depth == n){
			int appear[] = new int[10];
			for(int i = 0; i < n; i++){
				tmp += (char)(digits[i] + '0');
				appear[digits[i]]++;
			}
			if(appear[3]*appear[5]*appear[7] != 0){
				pq.add(Integer.parseInt(tmp));
			}

			return;
		}

		int pattern[] = {3,5,7};

		for(int i = 0; i < pattern.length; i++){
			digits[depth] = pattern[i];
			dfs(depth + 1, n);
		}
	}
}
