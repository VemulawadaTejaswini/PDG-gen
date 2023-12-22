import java.util.Arrays;
import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int H = scanner.nextInt();
		int[]a = new int[N];
		int[]b = new int[N];
		int count=0;
		boolean j  = false;
		int z  =0;
		int znum = 0;



		boolean[] flag = new boolean[N];
		Arrays.fill(flag, false);

		for(int i = 0;i < N;i++){
			a[i] = scanner.nextInt();
			b[i] = scanner.nextInt();


		}

		while(true){
			if(H <= 0){			//HP=0になったら終わり
				break;
			}
			int t = 0;
			int tnum = 0;
		
			for(int i = 0;i < N;i++){			//投げるダメージが一番高い刀の選択
				if(!flag[i]){					//刀が使われてなかったらよし
					int tt = t;
					tt = Math.max(t, b[i]);
					if(tt!= t){
						tnum = i;
						t = tt;
					}
				}
			}
			if(!j){
				 z  =0;
				 znum = 0;

				for(int i = 0;i < N;i++){				//切るダメージが一番高い刀の選択
					if(!flag[i]){					//刀が使われてなかったらよし
						int zz = z;
						zz = Math.max(z, a[i]);
						if(zz!= z){
							znum = i;
							z= zz;
						}
					}

				}
			}

			if(t > z && tnum != znum){				//投げる最高ダメージが切る最高ダメージより大きく、投げ最高が切る最高の刀と違う時、投げる
				H -= b[tnum];
				//				System.out.println("tumn "+tnum);
				count++;
				flag[tnum] =true;
				j = true;
			}else{
				//				System.out.println("z");

				while(H >= z){
					H -= a[znum];
					count++;
				}
				break;
			}
		}
		System.out.println(count);

	}
}
