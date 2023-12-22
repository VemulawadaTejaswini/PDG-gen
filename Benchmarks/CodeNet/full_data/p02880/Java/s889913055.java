import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int A = sc.nextInt();

    for (int i=1; i<10; i++){
      if(A%i==0){
        System.out.println('Yes');
        return;
      }
    }
    System.out.println('No');
  }
}