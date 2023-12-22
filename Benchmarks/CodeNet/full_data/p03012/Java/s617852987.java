import java.util.*;
import java.util.InputMismatchException;
 
class Main {
  public static void main(String args[]) {
    
      Scanner sc = new Scanner(System.in);
      int all = sc.nextInt();
      int[] w = new int[all];
      int result;
      
      
      for(int i = 0; i<all; i++){
        w[i] = sc.nextInt();
      }
      for(int i = 0; i<all; i++){
        if(!(nibun(all,i,w))){resurt=i;}
        
      }
     
      int mae2;
      int ato2;
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
    int mae;
    int ato;
    for (int i = 0; i<t; i++){
      mae += w[i];
    }
    for (int i = 0; i<all-t; i++){
      ato += w[i+t];
    }
    return mae>ato;
  }
}