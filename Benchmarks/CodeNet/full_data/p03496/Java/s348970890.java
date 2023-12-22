import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] data = new int[N];

		for(int i = 0;i < N;i++){
			data[i] = scanner.nextInt();
		}

		int[] copy = data.clone();


		Arrays.sort(copy);



		int[] plus = new int[N];
		int[] minus = new int[N];

		int p = 0;					//配列plusのインデックス
		int m = 0;					//配列mnusのインデックス

		int pnum = 0;				//配列plusの中の最大値のインデックス
		int mnum = 0;				//配列の中の最大値のインデックス

		for(int i = 0;i < N;i++){			//マイナスとプラスの値をそれぞれの配列にコピー
			if(copy[i] <= 0){
				minus[m] = copy[i];
				m++;
			}else{
				plus[p] = copy[i];
				p++;
			}
		}
		m--;
		p--;
		
		if(p == -1){
			p = 0;
		}
		if(m == -1){
			m = 0;
		}

		System.out.println(plus[p]);
		System.out.println(minus[m]);


		for(int i = 0;i < N;i++){				//絶対値の大きさが最大のとこのindexを見つける
			if( data[i] == plus[p] ){
				pnum = i;
			}else if(data[i] == minus[0]){
				mnum = i;

			}
		}


		int absplus = Math.abs(plus[p]);
		int absminus = Math.abs(minus[0]);

		int[] ans1 = new int[10*N];
		int[] ans2 = new int[10*N];
		int a1 = 0;
		int a2 = 0;

		if(absminus >= absplus){				//絶対値が一番大きいのがマイナスのやつ
			int key = minus[0];

			for(int i = 0;i < N-1;i++){

				if(data[i+1] < data[i]){

					ans1[a1] = mnum+1;;
					ans2[a2] = i+1;
					a1++;
					a2++;
					data[i] += key;
					i = -1;

//					for(int j = 0;j < N;j++){
//						System.out.println(data[j]);		
//					}
//					System.out.println();

				}
			}



		}else{					//絶対値が一番大きいのがプラスのやつ

			int key = plus[p];
			for(int i = 0;i < N-1;i++)
				if(data[i+1] < data[i]){

					ans1[a1] = pnum+1;
					ans2[a2] = i+2;
					a1++;
					a2++;
					data[i+1] += key;
					i = -1;

				}
		}




		System.out.println(a1);

		for(int i = 0;i < a1;i++){
			System.out.println(ans1[i] + " "+ ans2[i]);
		}







	}




}

class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

