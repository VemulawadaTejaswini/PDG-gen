import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      //入力値を取り込む
      Scanner sc = new Scanner(System.in);
      //0を消去して1だけ残し、その長さを出力すれば1の個数になる
      //replaceよりもreplaceAllの方が早い、なぜ？
      int i = sc.next().replaceAll("0","").length();
      //出力する
      System.out.println(i);
    }
}

