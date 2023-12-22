import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int ary[] = new int[n+1];
    ary[0] = 0;
    int cnt = 1;
    for(int c = 1;c<n;c++){
      ary[c] = sc.nextInt();
      if(ary[c]<=x)cnt++;
    }
    System.out.println(cnt);
  } 
}