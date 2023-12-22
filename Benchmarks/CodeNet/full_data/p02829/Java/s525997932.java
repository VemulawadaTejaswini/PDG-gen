import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a + b;
    if(sum == 3){
      System.out.println(3);
    }else if(sum == 4){
      System.out.println(2);
      }else{
      System.out.println(1);          
      }
  }
}