import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next()); 
    int B = Integer.parseInt(sc.next()); 
    if(A==B){
      
    System.out.println(1);
    }else{
    int ans = B/A+1;
    System.out.println(ans);
    }
  }
}

