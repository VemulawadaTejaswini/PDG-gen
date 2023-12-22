import java.util.*;

public class Main { //クラス名はMain
    public static void main(String[] args) {
      //整数の入力
      Scanner sc = new Scanner(System.in);
	  String n = sc.next();
      String a = "a";
      int goodCount = 0;
      for(int i=0; i<4; i++){
        //一緒だったらカウントする
      	if(i > 0 && a.equals(n.substring(i,i+1))) goodCount++;
        //文字確認する値を一つズラす
        a = n.substring(i,i+1);
      }
      if(goodCount >= 3){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }     
}
