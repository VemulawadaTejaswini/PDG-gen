import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int a = sc.nextInt();
    double ans = 100001.0;
    double bef;
    int answer = 0;
    for(int i=0; i<n; i++){
      bef = ans;
      ans = Math.min( ans,Math.abs( a-(t-sc.nextInt()*0.006) ) );
      if(bef != ans) answer = i+1;
    }
    System.out.println(answer);
  }
}