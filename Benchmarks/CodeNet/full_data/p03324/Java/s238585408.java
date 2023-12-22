import java.util.Scanner;

public class Main{
  
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    Long a = 1L;
    int k = s.nextInt();
    for (int i=0;i< k;i++){a *= 100;}
    System.out.println(a * s.nextLong());
  }
}
  