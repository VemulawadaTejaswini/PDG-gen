import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
 
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int sum = a+ b ;
    if(sum < a+c){
      sum = a+c;
    }
    if(sum < b+c){
      sum = b + c;
    }
    System.out.println(sum);
  }
}