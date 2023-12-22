import java.util.Scanner;
public class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int x = b / (a - 1);
    if(x == 0) x++;
    if(x != 1 && b % (a - 1) != 0) x++;
    System.out.println(x);
  }
}