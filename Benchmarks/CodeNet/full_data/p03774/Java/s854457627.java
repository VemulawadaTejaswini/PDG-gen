import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		long[]stuX = new long[n];
		long[]stuY = new long[n];
		long[]pntX = new long[m];
		long[]pntY = new long[m];
		for(int i=0;i<n;i++) {
			stuX[i]=scan.nextLong();
			stuY[i] = scan.nextLong();
		}
		for(int i=0;i<m;i++) {
			pntX[i]=scan.nextLong();
			pntY[i] = scan.nextLong();
		}
		long[][] zettai = new long[n][m];//学生からポイントまでのマンハ距離

		int[] saitanP = new int[n];//いちばん近いポイントのポイント番号を記録する
		for(int i=0;i<n;i++) {
			//（ある学生から見て）一番近いポイントまでの距離。iが動いたら初期化する
			long saitanL = (long)Math.pow(10, 8);
			//System.out.println(saitanL);
			for(int l=0;l<m;l++) {
				zettai[i][l]=Math.abs(stuX[i]-pntX[l])+Math.abs(stuY[i]-pntY[l]);
				//i番目の学生のポイント0～ｌに対する距離
				//System.out.println("マンハッタン="+zettai[i][l]);

//その距離が最短だったらそのポイントの番号を記録
					if(saitanL>zettai[i][l]) {
						saitanL = zettai[i][l];
						saitanP[i]=l+1;
						//System.out.println(saitanP[i]);

					}

				}
			}
		for(int i=0;i<n;i++) {
			System.out.println(saitanP[i]);
		}


		}



	}


