import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    if(a.length() == 1){
      System.out.println(Integer.parseInt(a));
    }else{
      int n = 1;
      int njyou[] = new int[a.length() - 1];
      for(int i = 0;i<a.length() -1;i++){
        if(i == 0){
          njyou[i]=1;
        }else{
          njyou[i]=2*njyou[i-1];
        }
      }
      int ans = 0;
      for(int i = 0;i<a.length()-1;i++){
        ans += njyou[a.length()-2-i]*Integer.parseInt(a.substring(i,i)) + Integer.parseInt(a.substring(i,a.length()-1));
      }
      ans += Integer.parseInt(a.substring(a.length()-1,a.length()-1));
      System.out.println(ans);


    }
  }
}