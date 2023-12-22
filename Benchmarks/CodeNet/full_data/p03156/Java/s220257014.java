import java.util.ArrayList;
import java.util.Scanner;

class Main{
	static int[][] dp;




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int[] p = new int[N];
		ArrayList<Integer> one = new ArrayList<Integer>();
		ArrayList<Integer> two = new ArrayList<Integer>();
		ArrayList<Integer> three = new ArrayList<Integer>();

		for(int i = 0;i < N;i++){
			p[i] = sc.nextInt();
			if(p[i] <= A){
				one.add(p[i]);
			}else if(p[i] <= B){
				two.add(p[i]);
			}else{
				three.add(p[i]);
			}
		}
		int min = Math.min(one.size(), Math.min(two.size(), three.size()));
		
		
		System.out.println(min);
		
	}


}







class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

