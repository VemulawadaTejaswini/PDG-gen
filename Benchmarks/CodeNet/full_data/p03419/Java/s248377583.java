import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long h=sc.nextLong(),w=sc.nextLong();
    
    System.out.println(Math.max((h-2)*(w-2),0));
  }
}
