import java.util.Arrays;
import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int[] a = new int[3];
		for(int i = 0;i < 3;i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		int ans =a[0]*a[1]/2;
		System.out.println(ans);
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

		return from - otherpair.from;
	}
}

