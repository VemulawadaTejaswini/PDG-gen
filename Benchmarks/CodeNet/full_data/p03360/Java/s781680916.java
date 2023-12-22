import java.util.Arrays;
import java.util.Scanner;

class Main{



	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();


		int ans = 0;
		int[] data = {a,b,c};	
		
		Arrays.sort(data);
		for(int i = 0;i < k;i++){
			data[2] *= 2;
		}
		System.out.println(data[2]+data[1]+data[0]);


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



