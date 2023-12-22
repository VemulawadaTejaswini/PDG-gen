import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    long k=s.nextLong(),a=s.nextLong(),b=s.nextLong();
    long c=Math.max(0,k-a+1);
    System.out.print(Math.max((b-a)*(c/2)+a+c%2,k+1));
  }
}