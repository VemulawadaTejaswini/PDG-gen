import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();    
    int C = sc.nextInt();

    if(A == B){
      if(A!=C){
        System.out.println("Yes");
        return;
      }
    }
    if(A == C){
      if(B!=C){
        System.out.println("Yes");
        return;
      }
    }
    if(B == C){
      if(A!=C){
        System.out.println("Yes");
        return;
      }
    }

    System.out.println("No");
    return;


    
  }
}

