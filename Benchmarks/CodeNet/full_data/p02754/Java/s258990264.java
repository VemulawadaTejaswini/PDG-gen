import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    long N = scanner.nextLong();
    long A = scanner.nextLong();
    long B = scanner.nextLong();
    long answer = A * (N / (A+B));
    answer += Math.min(N % (A+B),A);//小さいほうの値を返す
    /*
    <上と同じ>
    if(N % (A+B) > A){
    	answer = answer + N % (A+B);
    }else{
    	answer = answer + A;
    }
    */
    System.out.println(answer);
  }
}