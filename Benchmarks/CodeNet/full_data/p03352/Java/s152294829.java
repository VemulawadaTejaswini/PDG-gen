import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    //べき乗数を探す
    for(int i=X;i>0;i++){
      if(judge(i)){
        break;
      }
    }
    //べき乗数かどうか
    private static boolean judge(int n){
      for(int i=1;i<n;i++){
        for(int j=1;j<n;j++){
          int m = (int)Math.pow(i,j);
          if(m==n){
            return true;
          }else{
            return false;
          }
      }
    }
    System.out.println(i);
  }
}