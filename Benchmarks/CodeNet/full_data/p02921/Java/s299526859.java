import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String s = sc.next();
		String t = sc.next();
      // 結果の初期化
      Integer kekka = 0;
      // 比較
      for(int i = 0; i < 3; i++){
        if(s.substring(i,i+1).equals(t.substring(i,i+1))){
        // 予報と実際が一致
          kekka++;
        }else{
          // 不一致
        }
      }
        		// 出力
		System.out.println(kekka);
      
    }
  
}