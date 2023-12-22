import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long N = scan.nextLong();
    System.out.print("0 0 ");
    long A = N/1000000000;
    long B = N%1000000000;
    System.out.println("10000000000 1 "+B+" "+A);
  }
}