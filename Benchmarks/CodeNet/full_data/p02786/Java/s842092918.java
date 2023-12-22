import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long H = sc.nextLong();
    int sum = 1;
    while(H>1){
      if(H%2 ==0){
        H = H/2;
      }else{
        H = (H-1)/2;
      }
        sum ++; 
    }
    long total =0;
    for(int i = 0; i < sum; i++){
      total = total + (long)Math.pow(2, i);
    }
    System.out.println(total);
    return;
  }
}
