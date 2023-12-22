import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] ans = new int[n];

    // 部下の人数を数える
    for(int i=0; i<n-1; ++i) {
      ans[sc.nextInt()-1]++;
    }

    // 出力
    for(int p : ans) {
      System.out.println(p);
    }
  }
}