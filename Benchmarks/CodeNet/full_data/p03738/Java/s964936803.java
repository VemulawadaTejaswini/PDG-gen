import java.util.Scanner;
 
class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
 
int a = scanner.nextInt();
int b = scanner.nextInt();
 
if(a > b) {
    System.out.println("GREATER");
} else if(a < b) {
    System.out.println("LESS");
} else {
    System.out.println("EQUAL");
}
}
}