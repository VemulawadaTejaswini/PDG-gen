import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int h = sc.nextInt();
    int n = sc.nextInt();
    int ww = 0;
    int hh = 0;
    
    //黒くなる部分求める
    for(int i = 0 ; i < n ; ++i){
      int x = sc.nextInt();
      int y = sc.nextInt();
      int a = sc.nextInt();      
      if(a==1){
        ww = Math.max(ww,x);
      }
      if(a==2){
        ww = Math.max(ww,(w-x));
      }
      if(a==3){
        hh = Math.max(hh,y);
      }
      if(a==4){
        hh = Math.max(hh,(h-y));
      }
    }
    int ans = (w-ww)*(h-hh);
    if(w-ww<0 || h-hh<0) ans = 0;
    System.out.println(ans);
    
  }
}