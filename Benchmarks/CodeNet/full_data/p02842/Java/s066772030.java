import java.util.*;

public class Main {
	
	public static void main(String[] args) {

	  // argumentの取得
	  Scanner s = new Scanner(System.in);
      double N = s.nextInt();
      
      
	  // 戻り値の返却
      // N % 108だと値が変わって動かない。。後で調べる
      if ((N * 100 % 108) == 0) {
        System.out.println(N/1.08);
      } else {
        // 元に戻るか判定
        // Nを1.08で割る
        double tempA = Math.floor(N/1.08);
        
         // ↑に1.08をかけて、小数点を捨ててもとに戻ればOK
        double tempB = Math.floor((Math.floor(tempA +1) * 1.08));
        //System.out.println(tempA);
        //System.out.println(tempB);
        
        if (N == tempB) {
          //System.out.println(Math.floor(tempA +1));
          System.out.println(String.format("%.0f",Math.floor(tempA +1)));
          //String.format("%.2f", b)
        } else {
          System.out.println(":(\n");
        }
       
      }
	
	} 
}