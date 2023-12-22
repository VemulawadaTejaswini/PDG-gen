import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int minB = 10*B;
    int maxB = minB+9;
    int minA = 0;
    int maxA = 0;
    if(A%2==0){
      minA = (25*A)/2;
      maxA = minA + 12;
    }else{
      minA = (25*A)/2+1;
      maxA = (25*(A+1)/2)-1;
    }
    if(minA>maxB||minB>maxA){
      System.out.println(-1);
    }else if(minA<=minB){
      System.out.println(minB);
    }else{
      System.out.println(minA);
    }
    
    
      
      
  }
  

  
}