
import java.util.Scanner;

class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();

    int sum1 = A + B ;

    if (A % 3 == 0 || B % 3 == 0) {
       if (sum1 % 3 == 0){
         System.out.println("Possible");

       }
    }
    else {
      System.out.println("Impossible") ;
    }

  }
}
