import java.util.Scanner;
 public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
      
      int a =A*B;
      
      if(A>=9&&B>=9){
      System.out.println(a);
      }
      else{
      System.out.println(-1);
      }
    }
 }