import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int ct = 0;
    int digit;
    for (int i=1;i<=N;i++){
      digit = 0;
      double tmp = i;
      while (tmp>=1){
        tmp = Math.floor(tmp/10);
        digit++;
      }
      if ((digit%2) == 1){
        ct++;
      }
    }
    
    
    System.out.println(ct);
  }
}