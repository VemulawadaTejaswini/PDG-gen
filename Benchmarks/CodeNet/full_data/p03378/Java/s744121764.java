import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int X = sc.nextInt();
    int zero =0;//0側にゴールした時にかかる金額
    for(int i=0;i<M;i++){
      if(sc.nextInt()<X){
        zero++;
      }
    }
    System.out.println(Math.min(zero,M-zero));
  }
  

  
}