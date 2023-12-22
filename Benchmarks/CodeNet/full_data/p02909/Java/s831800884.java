import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 文字列の入力
		String s = sc.next();
      String o;
      if(s.equals("Sunny")){
      	o="Cloudy";
      }else if(s.equals("Cloudy")){
      	o="Rainy";
      }else {
      	o="Sunny";
      }
		// 出力
		System.out.println(o);
	}
}