import java.util.*;

public class Main {    
    public static void main(String[] args){        
           
        Scanner sc = new Scanner(System.in);                 
        
        int witdh  = 0;
        int height = 0;
        int W = sc.nextInt();
        int H = sc.nextInt();
        int N = sc.nextInt();
        
        int ans = W*H;
        
        for(int i = 0;i < N;i++){
           int x1 = sc.nextInt();
           int y1 = sc.nextInt();
           int  a = sc.nextInt(); 
           switch(a){
              case 1:
                if(x1 - witdh < 0 || H - height < 0)
                    continue;
                ans -= (x1 - witdh)*(H - height);
                witdh = x1;
                break;
              case 2:
                if(W - x1 < 0 || H - height < 0)
                    continue;
                ans -= (W - x1)*(H - height);   
                W = x1;
                break;
              case 3:
                if(y1 - height < 0 || W - witdh < 0)
                    continue;
                ans -= (y1 - height)*(W -witdh);
                height = y1;
                break;
              case 4:
                if(H-y1 < 0 || W - witdh < 0)
                    continue;
                ans -= (H-y1)*(W - witdh);
                H = y1;
                break;
           }           
        }
        
        if(ans < 0){
            System.out.println(0);
        }else{
            System.out.println(ans);
        }        
       
    }            
}
        