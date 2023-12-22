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
      
		System.out.println(amari);
      
      if (amari > 0){
        // 口の余りが0の場合はソケットが追加で必要
        socket = socket + 1;
      }else if(socket > 1){
        // 余りが0でもソケットが複数の場合は追加が必要
        socket = socket + 1;
      }else{
        // 何もしない
      }
      
        		// 出力
		System.out.println(socket);
      
    }
  
}