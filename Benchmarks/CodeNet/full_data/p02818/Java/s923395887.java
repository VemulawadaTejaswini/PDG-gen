
import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int A = s.nextInt();
    int B = s.nextInt();
    int K = s.nextInt();

    for(int i = 0;i < K;i++){
      if(A > 0){
        A--;
      }else if(B > 0){
        B--;
      }else{
        break;
      }
    }
    System.out.println(A);
    System.out.println(B);
  }
}
