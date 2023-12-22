import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double A = sc.nextDouble();
    double B = sc.nextDouble();
    double AA = A/0.08;
    double BB = A/0.1;
    if(AA==BB){
      System.out.println((int)AA);
      return;
    }else if(AA>BB){
      if(B==Math.floor(AA*0.1)){
        System.out.println((int)AA);
        return;
      }
    }else if(AA<BB){
      if(A==Math.floor(BB*0.08)){
        System.out.println((int)BB);
        return;
      }
    }
    System.out.println(-1);    
  }
}


