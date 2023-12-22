import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		for(int i = 0;i < n;i++){
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
	ArrayList<Pair> pairs = new ArrayList<Pair>();
	
		for(int i = 0;i < n;i++){
			Pair pair =new Pair() ;
			pair.from = i;
			pair.end = A[i] + B[i];
			pairs.add(pair);
		}
		Collections.sort(pairs);
		long a = 0l;
		long b = 0l;

		long takahasi = 0;
		long aoki = 0;
		
		for(int i = 0;i < n;i++){
			if(i%2 == 0){
				takahasi += A[pairs.get(i).from];
			}else{
				aoki += B[pairs.get(i).from];
			}
		}
		System.out.println(takahasi-aoki);


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

