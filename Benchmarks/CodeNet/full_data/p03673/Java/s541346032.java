import java.util.ArrayList;
import java.util.Scanner;

class Main{

	static int N;
	static int M;
	static 		ArrayList<ArrayList<Integer>> map;
	static boolean[] used;
	static int f = 0;
	static int s = 0;

	static int mindis = 1000000000;
	static ArrayList<Integer> saitan;




	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] a = new int[n+1];
		int[] b = new int[n+1];

		for(int i = 1;i <= n;i++){
			a[i] = sc.nextInt();
		}

		int num = 0;

		for(int i = 1;i <= (n+1)/2;i++){
		//	System.out.println(i);
			b[i] = a[n-2*(i-1)];
			num  = i;

		}

		if(n%2 == 0){
			int c = 0;
			for(int i = num+1;i < b.length;i++){
		//		System.out.println(i);
				b[i] = a[c*2+1];
				c++;

			}
		}else{
			int c = 0;
			for(int i = num+1;i < b.length;i++){
		//		System.out.println(i);
				b[i] = a[c*2+2];
				c++;

			}
			
		}

		for(int i = 1;i < b.length;i++){
			System.out.print(b[i]);
			System.out.print(" ");


		}
	}

}


