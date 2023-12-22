import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int ary[] = new int[n+1];
    ary[0] = 0;
    int d = 0;
    int cnt = 0;
    for(int c = 1;c<=n;c++){
      d += sc.nextInt();
      ary[c] = d;
    }
    for(int c = 0;c<=n;c++){
      if(ary[c]<=x)cnt++;
    }
    System.out.println(cnt);
  } 
}