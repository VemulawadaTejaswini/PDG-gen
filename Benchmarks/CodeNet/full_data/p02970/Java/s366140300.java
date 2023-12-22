import java.util.Scanner;
 public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int N = scanner.nextInt();
       int D = scanner.nextInt();
      
      int a =N/(D*2+1);
      if(N/(D*2+1)!=0){
       System.out.println(a+1);
      }
      else if(N/(D*2+1)==0){
      System.out.println(a);
    }
 }
}