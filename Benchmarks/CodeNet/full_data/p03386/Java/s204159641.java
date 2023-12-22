import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

class Main{

	static char[][] map;
	static int N;
	static int M;
	static boolean flag;
	static int ans;



	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int A =sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();


		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = A; i < A+K;i++){
			if(i > B){
				break;
			}
			list.add(i);
		}
		for(int i = B; i > B-K;i--){
			if(i < A){
				break;
			}
			list.add(i);
			
		}

		list = new ArrayList<Integer>(new HashSet<>(list));
		Collections.sort(list);
		
		for(int i = 0;i <list.size();i++){
			System.out.println(list.get(i));
		}



	}


}

class Pair implements Comparable{
	String from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}



