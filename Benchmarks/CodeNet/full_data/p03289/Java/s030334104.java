import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 文字列の入力
		String s = sc.next();
    
		// 出力
		System.out.println(check(s) ? "AC" : "WA");
	}
    public static boolean check(String value) {
      String[] values = value.split("");
      if (!values[0].equals("A")) {
        return false;
      }
      int cIndex = -1;
      for(int i = 2; i < values.length - 2; i++) {
        if (values[i].equals("C")) {
          if (cIndex >= 0) {
            return false;
          } else {
            cIndex = i;
          }
        }
      }
      if (cIndex < 0) {
        return false;
      }
      for(int i = 1; i < value.length(); i++) {
        if (i == cIndex) {
          continue;
        }
        if (Character.isUpperCase(value.charAt(i))) {
          return false;
        }
      }
      return true;
    }
}