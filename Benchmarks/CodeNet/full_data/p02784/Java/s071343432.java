import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long H = sc.nextLong();
    int N = sc.nextInt();
    long sum = 0;
    for(int i=0;i<N;i++){
      sum=sum+sc.nextLong();
    }
    if(H>sum){
      System.out.println("No");
      return;
    }else{
      System.out.println("Yes");
    }
  }
  

  
}