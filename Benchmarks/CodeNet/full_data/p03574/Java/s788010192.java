import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// Scannerで文字列を取得
		Scanner scan = new Scanner(System.in); 
		int H = scan.nextInt();
		int W = scan.nextInt();
		//HとWを使って、2次元行列を作成
		String[][] HW = new String[H][W];
		//出力用の2次元配列を作成
		int[][] newHW = new int[H][W];
		
		//H文だけ、scannerから文字列を取得する。
		//文字列を格納するための配列を準備
		String[] firstStr = new String[H];
		for(int i=0; i<H; i++) {
			firstStr[i]=scan.next();
		}
		
		//配列に格納した文字列を分割し、2次元配列に格納する。
		//分割後を格納する1次元配列を準備
		for(int i=0; i<H; i++) {
			String[] str = firstStr[i].split("",0);
			for(int j=0; j < str.length; j++) {
				HW[i][j]=str[j];
			}
		}


		//2重for文を回して、1つ1つ周りをチェックしていく。
		//0&0ならば、+-1を今の座標から行っていき、文字列をチェックする。マイナスにならないことと、(3,5)を超えないことを条件とする。
		//'#'の数をカウントしていき、新規で用意した2次元配列に格納する。
		for(int i=0; i<H; i++){
			for(int j=0; j<W; j++) {
				//y軸がマイナス1になった時の判断
				int i_a = i-1;
				if(i_a>=0) {
					if(HW[i_a][j].equals("#")) {
						newHW[i][j]+=1;
					}
					int j_a =j-1;
					if(j_a>=0) {
						if(HW[i_a][j_a].equals("#")) {
							newHW[i][j]+=1;
						}
					}
					int j_b =j+1;
					if(j_b<W) {
						if(HW[i_a][j_b].equals("#")) {
							newHW[i][j]+=1;
						}
					}
				}
				//y軸がプラス１になったときの話
				int i_b =i+1;
				if(i_b<H) {
					if(HW[i_b][j].equals("#")) {
						newHW[i][j]+=1;
					}
					int j_a =j-1;
					if(j_a>=0) {
						if(HW[i_b][j_a].equals("#")) {
							newHW[i][j]+=1;
						}
					}
					int j_b =j+1;
					if(j_b<W) {
						if(HW[i_b][j_b].equals("#")) {
							newHW[i][j]+=1;
						}
					}
				}
				//y軸が変更にならずに、x軸だけ上下するとき
				int j_a =j-1;
				if(j_a>=0) {
					if(HW[i][j_a].equals("#")) {
						newHW[i][j]+=1;
					}
				}
				int j_b =j+1;
				if(j_b<W) {
					if(HW[i][j_b].equals("#")) {
						newHW[i][j]+=1;
					}
				}
			}
		}


		//標準出力に出力する
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				if(HW[i][j].equals("#")) {
					System.out.print("#");
				}else {
					System.out.print(newHW[i][j]);	
				}
				
				if(j==(W-1)) {
					System.out.print("\r\n");
				}
			}
		}
	}

}
