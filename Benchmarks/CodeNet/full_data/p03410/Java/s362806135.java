import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main{

	//static long[] a;



	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		
		for(int i =0 ;i <N;i++){
			a[i] = sc.nextInt();
		}
		for(int i =0 ;i <N;i++){
			b[i] = sc.nextInt();
		}

		ArrayList<Integer> list =new ArrayList<Integer>();
		for(int i =0;i < N;i++){
			for(int j = 0;j < N;j++){
				list.add(a[i] + b[j]);
			}
		}
		
		System.out.println(list.get(0));
	}
}


