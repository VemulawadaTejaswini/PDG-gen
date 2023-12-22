import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    for(int i=X;i>0;i--){
      if(isRui(i)){
        System.out.println(i);
        return;
      }
    }
  }
  
  public static boolean isRui(int n){
     boolean res = false;
    for(int i=1;i<=n;i++){
      for(int j=2;j<12;j++){
        if(Math.pow(i,j)==n){
          return true;
        }
      }
    }
    return res;
  }
  
}