import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int H = sc.nextInt();
    int W = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    sc.close();
    
    for(int tate=1;tate<=H;tate++){
      for(int yoko=1;yoko<=W;yoko++){
        if (tate<=B){
          if(yoko<=A){
            System.out.print("0");
          }else{
            System.out.print("1");
          }
        }else{
          if(yoko<=A){
            System.out.print("1");
          }else{
            System.out.print("0");
          }
        }
      }
      System.out.println("");
    }

  }  
}