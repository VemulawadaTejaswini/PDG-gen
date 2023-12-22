import java.util.*;
import java.util.InputMismatchException;
 
class Main {
  public static void main(String args[]) {
    
      Scanner sc = new Scanner(System.in);
      int all = sc.nextInt()-1;
      int[] w = new int[all+1];
      int result=0;
      
      
      for(int i = 0; i<all; i++){
        w[i] = sc.nextInt();
      }
      for(int i = 0; i<all; i++){
        if(!(nibun(all,i,w))){result=i-1;}
        
      }
     
      int mae2=0;
      int ato2=0;
      for(int i=0; i<result; i++){
        mae2 += w[i];
      }
      for(int i=0; i<all-result; i++){
        ato2 += w[i+result];
      }

      sc.close();
      System.out.println(mae2-ato2);
    
    
  }
  
  public static boolean nibun(int all, int t, int[] w){
    int mae=0;
    int ato=0;
    for (int i = 0; i<t; i++){
      mae += w[i];
    }
    for (int i = 0; i<all-t; i++){
      ato += w[i+t];
    }
    return mae>ato;
  }
}