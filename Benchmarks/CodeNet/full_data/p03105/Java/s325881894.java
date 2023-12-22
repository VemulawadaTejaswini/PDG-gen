import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    int count = 0;

    while(true){

      if(B >= A){
        B = B - A;
        count = count + 1;
      }else{
       break;
      }

      if(count == C){
        break;
      }

    }
    System.out.println(count);
  }
}