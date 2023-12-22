import java.util.*;

public class Main {             
    
  static int A;
  static int B;
  static int C;
  static int D;
  static int E;
  static int F;
  
  public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);                                                                      
    
    A = sc.nextInt();
    B = sc.nextInt();
    C = sc.nextInt();
    D = sc.nextInt();
    E = sc.nextInt();
    F = sc.nextInt();
    
    int ans = Integer.MIN_VALUE;
            
    int first  = 0;
    int second = 0;
    
     nlabel:
     for(int n = 0;;n++){       
         mlabel:
         for(int m = 0;;m++){
             for(int p = 0;;p++){
                for(int q = 0;;q++){
                    if(100*A*n > F){
                        break nlabel;
                    }
                    int a = 100*A*n + 100*B*m;
                    if(a > F){
                        break mlabel;
                    }
                    
                    int b = C*p + D*q;
                                          
                    if((a + b) != 0 && a + b <= F && 100*b/(a + b) <= 100*E/(100 + E)){
                        ans = Math.max(ans,100*b/(a + b));
                        first = a + b;
                        second = b;
                    }
                                                            
                }                 
             }             
         }                  
     }       
     
     System.out.println(first +" " + second);
            
  }  
}


