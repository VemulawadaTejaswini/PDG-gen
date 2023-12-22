import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int K = sc.nextInt();
	int[] V = new int[N];
	for(int i = 0; i < N; i++){
	    V[i] = sc.nextInt();
	}

	// 左右それぞれ何個ずつ取るかをきめる
	// left + right + remove
	int max = 0;
	for(int left = 0; left <= K; left++){
	    for(int right = 0; right + left <= K; right++){
		int remove = K - right - left;
		if(remove > right + left) continue;

		// 実際に取りましょう
		ArrayList<Integer> score = new ArrayList<Integer>();
		for(int i = 0; i < left; i++) score.add(V[i]);
		for(int i = 0; i < right; i++) score.add(V[N - 1 - i]);
		// ソートします
		Collections.sort(score);

		// 負の数を除きながら総和を取る
		int sum = 0;
		int k = 0;
		for(int x : score){
		    if(x < 0 && k < remove){
			k++;
		    }
		    else{
			sum += x;
		    }
		}
		max = Math.max(max, sum);
							 
		
	    }
	}
	System.out.println(max);
    }
}
