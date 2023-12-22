import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//変数//
		int sx;		//スタート地点x座標
		int sy;		//スタート地点y座標
		int tx;		//ゴール地点x座標
		int ty;		//ゴール地点y座標
		int locationPattern = 0;		//スタートとゴールの位置関係を時計回りで順に番号付け
		StringBuffer S;		//出力
		
		Scanner scan = new Scanner(System.in);
		
		//入力//
		sx = scan.nextInt();
		sy = scan.nextInt();
		tx = scan.nextInt();
		ty = scan.nextInt();
		
		scan.close();
		
		//処理//
		//ｓとｔで長方形を作成して一周する
		//sとtの位置関係を取得する
		if( sx == tx ){						//縦
			locationPattern = -1;
		}else if( tx == ty ){				//横
			locationPattern = -2;
		}else if( sx < tx && sy < ty ){		//右上
			locationPattern = 1;
		}else if( sx < tx && sy > ty ){		//右下
			locationPattern = 2;
		}else if( sx > tx && sy > ty ){		//左下
			locationPattern = 3;
		}else if( sx > tx && sy < ty ){		//左上
			locationPattern = 4;
		}
		
		//横、縦の長さを取得
		int width = Math.abs(tx - sx);
		int vertical = Math.abs(ty - sy);
		
		//文字列の長さを確定
		if( locationPattern > 0 ){
			S = new StringBuffer( width + vertical );
		}else{
			S = new StringBuffer( width + vertical + 2 );
		}
		
		//各パターンごとに文字列生成
		switch (locationPattern){		
		case 1:
			S.append(makeString("U", vertical));
			S.append(makeString("R", width));
			S.append(makeString("D", vertical));
			S.append(makeString("L", width));
			break;
		case 2:
			S.append(makeString("R", width));
			S.append(makeString("D", vertical));
			S.append(makeString("L", width));
			S.append(makeString("U", vertical));
			break;
		case 3:
			S.append(makeString("D", vertical));
			S.append(makeString("L", width));
			S.append(makeString("U", vertical));
			S.append(makeString("R", width));
			break;
		case 4:
			S.append(makeString("L", width));
			S.append(makeString("U", vertical));
			S.append(makeString("R", width));
			S.append(makeString("D", vertical));
			break;
		case 0:
			S.append(makeString("L", width));
			S.append(makeString("U", vertical));
			S.append(makeString("R", width));
			S.append(makeString("D", vertical));
			break;
		}
		
		//結果//
		System.out.println(S);

	}
	
	public static StringBuffer makeString(String way, int length ){
		StringBuffer ans = new StringBuffer(length);
		
		for(int i = 0; i < length; i++){
			ans.append(way);
		}
		
		return ans;
	}

}
