import java.util.*;
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();
    int sum =0;
 
    for(int i=0;i<2;i++){
      if(A > B){
        sum+= A;
        A-=1;
      }else{
        sum+= B;
        B-=1;
    }
    }
    System.out.println(sum);
  }
}