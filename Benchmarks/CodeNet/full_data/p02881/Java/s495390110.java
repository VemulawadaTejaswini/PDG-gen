import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int A = sc.nextInt();

    int score=0;
    int thre=0;
    for (int i=1; i<A; i++){
      if (i>thre && thre!=0)break; 
      if(A%i==0){

        int B = i;
        int C = A/i;
        int sc = (B-1+C-1);
        if(score==0){score = sc;thre=Math.max(B,C)}
        else if (score>sc){
          score =  sc;
        }

      }
    }
    System.out.println(score);
  }
}