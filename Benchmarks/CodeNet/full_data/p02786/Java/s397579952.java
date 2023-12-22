import java.util.*;
public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    long H = sc.nextLong();
    
    int n = 1;
    long result = 0;

    while(true){
      result = (long) Math.pow(2,n);
      if(result > H){break;}
      n++;
    }
    
    //a_n=2^(n-1)の等比数列の、n項までの和
    long s = (long) Math.pow(2,n) - 1;
    System.out.println(s);
    
  }
}