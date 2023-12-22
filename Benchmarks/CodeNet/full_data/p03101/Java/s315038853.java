import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // H,W,h,wを取得
    int H = sc.nextInt(); //列数
    int W = sc.nextInt(); //行数
    int h = sc.nextInt(); //黒塗り列数
    int w = sc.nextInt(); //黒塗り行数
    // 出力
    System.out.println(H*W-(h*W+H*w)+h*w);
  }
/*
  public static int countSum(int num){
    int sum=0;
    // 各桁の和
    while(num>0){
      sum += num%10;
      num=num/10;
    }
    return sum;
  }
  */
}
