import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int d = 0;
    int cnt = 0;
    for(int c = 0;c<n;c++){
      int l = sc.nextInt();
      if(d>x)break;
      d += l;
      cnt++;
    }
    System.out.println(cnt);
  } 
}