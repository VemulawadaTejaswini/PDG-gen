import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int i=0;
    //べき乗数を後ろから探す
    for(i=X;i>0;i--){
      if(judge(i)){
        break;
      }
    }
    System.out.println(i);
  }
    //べき乗数かどうか
    private static boolean judge(int n){
      boolean re = false;
      if(n==1){//１のとき
        re = true;
      }else{//１以外なら
        for(int i=2;i<n;i++){
          for(int j=1;j<n;j++){
            int m = (int)Math.pow(i,j);
            if(m==n){
              re = true;
              break;
            }
          }
        }
      }
        return re;
      }
}