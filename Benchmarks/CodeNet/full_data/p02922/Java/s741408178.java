import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int kuchi = sc.nextInt();
		int hitsuyou = sc.nextInt();
      // 結果の初期化
      int socket = 0;
      // 比較
      socket = hitsuyou / kuchi;
      
      // 余りの計算
      int amari = hitsuyou % kuchi;
      
      
      if (amari > 0){
        // ソケットが２つ追加で必要
        socket = socket + 1;
      }else{
        // 何もしない
      }
      
        		// 出力
		System.out.println(socket);
      
    }
  
}