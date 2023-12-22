import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 文字列の入力
        List<String> sList = Arrays.asList(sc.next().split(""));
        Collections.sort(sList);
        int count = 0;
        String lastChar = "";
        String ans = "Yes";
        for(String chara : sList) {
          if (!chara.equals(lastChar)) {
            if (count % 2 == 0) {
              count = 0;
            } else {
              ans = "No";
              break;
            }
          }
          lastChar = chara;
          count++;
        }
        if (count % 2 == 1) {
          ans = "No";
        }
      
		// 出力
		System.out.println(ans);
	}
}
