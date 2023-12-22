import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		String[] ar = a.split("");
		
		int ar_len = ar.length;
		

		int length_first = 1; //一番始めの文字列の長さ
		String previous =""; //一つ前の文字列
		String corrent=""; //現在の文字列
		
		int corrent_i = 0; //現在参照しているインデックス番号
		
		int count=0; //要素の数
		
		
		while(true){
			if(count==0) { //最初の文字列の作成
				
				count=1;
				corrent_i = 0; 
				
				//もし全体の文字列長と一致しているならcount=1で終わり
				if(ar_len == length_first) break;
				
				//そうじゃないなら最初の文字列の作成
				for(int i=0;i<length_first;i++) {
					previous = previous + ar[i];
				}
				
				corrent_i += length_first;
				corrent= corrent+ar[corrent_i];
			}else { //最初以外の文字列
				
				
				if(corrent.equals(previous)) {//もし前の要素と一致しているなら
					//現在が最後の要素ならcount=0とし，length_firstを増加
					if(corrent_i == ar_len-1) {
						count=0;
						length_first++;
					}else {
						//corrent_iを増加させ，correntに要素追加
						
						corrent = corrent + ar[corrent_i];
						corrent_i++;
						
					}
					
				}else { //一致していない時
					//countの増加
					count++;
					
					//現在が最後の要素なら確定
					if(corrent_i == ar_len-1)break;
					//最後じゃないならpreviousを入れ替えてcorrentを初期化
					previous = "";
					previous = previous.concat(corrent); //バグっぽい
					corrent=""; //初期化
					//corrent_iの増加
					corrent_i++;
					corrent=corrent + ar[corrent_i];
				}
				
			}
			
			
			
		}
		
		
		System.out.println(count);
	}

}