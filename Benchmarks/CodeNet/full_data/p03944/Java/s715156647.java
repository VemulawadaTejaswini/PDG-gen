import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int h = sc.nextInt();
    int n = sc.nextInt();
    int ww = w;
    int hh = h;
    int c_1 = 0;
    int c_2 = 0;
    int c_3 = 0;
    int c_4 = 0;
    int n_1 = 0;
    int n_2 = 0;
    int n_3 = 0;
    int n_4 = 0;

    for(int i = 0 ; i < n ; ++i){
      int x = sc.nextInt();
      int y = sc.nextInt();
      int a = sc.nextInt();
      
      if(a==1){        
        if(c_1==0){
          n_1 = x;  
        }else{
          x = x-n_1;
        }
        if(x<0) break;
        ww -= x;
        c_1++;
      }
      if(a==2){
        if(c_2==0){
          n_2 = x;  
        }else{
          x = x-n_2;
        }
        if(x<0) break;
        ww -= (w-x);
        c_2++;
      }
      if(a==3){
        
        if(c_3==0){
          n_3 = y;  
        }else{
          y = y-n_3;
        }
        if(y<0) break;
        hh -= y;
        c_3++;
      }
      if(a==4){
        if(c_4==0){
          n_4 = y;  
        }else{
          y = y-n_4;
        }
        if(y<0) break;
        hh -= (h-y);
        c_4++;
      }
    }
    int ans = ww*hh;
    if(ans<0) ans = 0;
    System.out.println(ans);
    
  }
}