import java.util.Scanner;
 public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
      int B = scanner.nextInt();
      
      int a =A-B*2;
      
      if(B*2>=A){
      System.out.println(0);
      }
      else{
       System.out.println(a);
      }
    }
 }