
import java.util.Scanner;

class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();


    if ((A + B) % 3 == 0){
      System.out.println("Possible");
    }

    if ((A + B) % 3 != 0){
    System.out.println("Impossible") ;
    }

  }
}
