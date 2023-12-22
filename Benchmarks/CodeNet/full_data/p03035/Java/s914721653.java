import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    int age = 0;
    int change = 0;
    int result = 0;
    Scanner sc = new Scanner(System.in);
    
    age = sc.nextInt();
    change = sc.nextInt();
    
    if(age <= 5) {
      result = 0;
    }else if((6 <= age) && (age <= 12)) {
      result = change / 2;
    }else {
      result = change;
    }
    
    System.out.println(result);
  }
}