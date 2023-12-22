import java.util.Scanner;

public class Dj {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month and date");
        int m = sc.nextInt();
        int d_= sc.nextInt();
        int ans = 0 ; 
       
        for(int m_ = 1 ; m_<=m ; m_++){ int d1  , d2;
             for(int d=10 ; d<=d_ ; d++){
              d1=  d%10 ; 
              d2 = d/10;
               if(d1>=2d && d2>=2d && d1*d2==m_) ans++;
        }
        }
        System.out.println(ans);
        
         
    }
}
