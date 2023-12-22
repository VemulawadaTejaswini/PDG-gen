import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    //準備
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    //答の入れ物
    int max = 0;
    //ACGT文字列のカウンタ
    int cnt = 0;

    //ACGT文字列なら1、それ以外なら0に変換
    for(int i=0; i<s.length(); i++){
      char c = s.charAt(i);
      if(c == 'A' | c == 'C' | c == 'G' | c == 'T') ++cnt;
      else { max = Math.max(max, cnt); cnt=0; }
    }
    //ACGT文字列最大長の更新
    max = Math.max(max, cnt);

    //出力
    System.out.println(max);
  }
}