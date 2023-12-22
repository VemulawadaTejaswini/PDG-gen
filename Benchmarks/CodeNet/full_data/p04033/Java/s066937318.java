import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a=sc.nextLong(),b=sc.nextLong(),f=1;
    for(long i=a;i<=b;i++){
      f*=i;
    }
    if(f>0){
      System.out.println("Positive");
    }else if(f==0){
      System.out.println("Zero");
    }else{
      System.out.println("Negative");
    }
  }
}
