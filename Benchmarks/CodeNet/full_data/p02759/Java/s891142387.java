import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N =sc.nextInt();
    int cnt = 0;
    if(N%2 == 0){
      cnt = N/2;
      System.out.println(cnt);
    }else{
      cnt=(int)(N/2) +1;
      System.out.println(cnt);
    }
    
  }


}
