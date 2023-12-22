import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long H = sc.nextLong();
    long W = sc.nextLong();
    long answer = 0;
    if(H*W%2==0){
      answer = (H*W)/2;
    }else{
      answer = ((H*W)/2)+1;
    }
    System.out.println(answer);
  }
  

  
}