import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long y = sc.nextLong();
    int count = 0;
    long i = x;
    while(i <= y){
      count++;
      i *= 2;
    }
    
    System.out.println(count);
  }
}