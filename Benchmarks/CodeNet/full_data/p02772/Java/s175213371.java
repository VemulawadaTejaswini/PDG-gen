import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      int N =sc.nextInt();
      int A =sc.nextInt();
      
      //偶数を見つけだす
      for(int i=0;i<N;i++){
        if(A % 2==0){
        }
      } 
        //3か5で割り切れるか
         if(A%3==0||A%5==0){
           System.out.println("APPROVED");
           return;
        }
       System.out.println("DENIED");
    }
}