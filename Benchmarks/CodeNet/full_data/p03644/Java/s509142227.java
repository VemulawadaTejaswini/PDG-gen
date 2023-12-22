import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int squ = 1;
    while(n/2 >= squ){
      squ *= 2;
    }
    System.out.println(squ);
  }
}
