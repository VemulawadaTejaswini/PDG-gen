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
		ArrayList<Pair> tpairs = new ArrayList<Pair>();
		ArrayList<Pair> apairs = new ArrayList<Pair>();
		for(int i = 0;i < n;i++){
			Pair pair =new Pair();
			pair.from = i;
			pair.end = A[i];
			tpairs.add(pair);
		}
		for(int i = 0;i < n;i++){
			Pair pair =new Pair();
			pair.from = i;
			pair.end = B[i];
			apairs.add(pair);
		}
		Collections.sort(tpairs);
		Collections.sort(apairs);

		long tsum = 0l;
		long asum = 0l;
		for(int i = 0;i < n-1;i++){

			if(i % 2 == 0){				//たかはしターン
				//				System.out.println("takahasi");

				int maxt = tpairs.get(0).end;				//高橋の最大値
				long maxtnum = tpairs.get(0).from;			//それがなんばんめの要素か
				long secondt =tpairs.get(1).end;				//高橋の最大値
				long secondtnum = tpairs.get(1).from;			//それがなんばんめの要素か


				long maxa = apairs.get(0).end;				//青木の最大値
				long maxanum = tpairs.get(0).from;			//それがなんばんめの要素か
				long seconda = apairs.get(1).end;				//高橋の最大値
				long secondanum = apairs.get(1).from;			//それがなんばんめの要素か


				if(maxanum == maxtnum){
					tsum += maxt;
					tpairs.remove(0);
					apairs.remove(0);
				}else{
					int kari = 0;
					for(int y = 0;y < apairs.size();y++){
						if(apairs.get(y).from == maxtnum){
							kari =y;
							break;
						}
					}
					int karikari = 0;
					for(int y=0;y < apairs.size();y++){
						if(tpairs.get(y).from == maxanum){
							karikari =y;
							break;
						}
					}
					if((maxt - maxa) >= tpairs.get(kari).end - seconda){
						tsum += maxt;
						tpairs.remove(maxt);
						apairs.remove(kari);	

					}else{
						tsum += tpairs.get(karikari).end;
						tpairs.remove(karikari);
						apairs.remove(maxa);
					}

				}
				//				System.out.println("maxa "+maxa+" maxt "+maxt);

			}else{				//たかはしターン
				//				System.out.println("aoki");

				int maxt = tpairs.get(0).end;				//高橋の最大値
				long maxtnum = tpairs.get(0).from;			//それがなんばんめの要素か
				long secondt =tpairs.get(1).end;				//高橋の最大値
				long secondtnum = tpairs.get(1).from;			//それがなんばんめの要素か


				long maxa = apairs.get(0).end;				//青木の最大値
				long maxanum = tpairs.get(0).from;			//それがなんばんめの要素か
				long seconda = apairs.get(1).end;				//高橋の最大値
				long secondanum = apairs.get(1).from;			//それがなんばんめの要素か


				if(maxanum == maxtnum){
					asum += maxa;
					tpairs.remove(0);
					apairs.remove(0);
				}else{
					int kari = 0;
					for(int y = 0;y < apairs.size();y++){
						if(apairs.get(y).from == maxtnum){
							kari =y;
							break;
						}
					}
					int karikari = 0;
					for(int y = 0;y < apairs.size();y++){
						if(tpairs.get(y).from == maxanum){
							karikari =y;
							break;
						}
					}
					if((maxa - maxt) >= apairs.get(kari).end - secondt){
						asum += maxa;
						tpairs.remove(karikari);
						apairs.remove(maxanum);	

					}else{
						asum += apairs.get(kari).end;
						tpairs.remove(maxtnum);
						apairs.remove(karikari);
					}

				}
				//				System.out.println("maxa "+maxa+" maxt "+maxt);

			}

			//			System.out.println("tsum "+tsum+" asum "+asum);
			//			System.out.println();



		}
		if(n % 2 != 0){
			tsum += tpairs.get(0).end;
		}else{
		asum += apairs.get(0).end;
		}


				System.out.println((tsum-asum));




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

