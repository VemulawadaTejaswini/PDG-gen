import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int d = sc.nextInt();
    int cnt = 0;
    for(int i = 1;i <= m;i++){
      for(int j = 22;j <= d;j++){
        int x = j/10;
        int y = j%10;
        if(x>=2&&y>=2&&x*y==i)cnt++;
      }
    }
    System.out.println(cnt);
  }
}
