import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int min = 100000;   
    int target = 0;
    int sumA = 0;
    int sumB = 0;

    for(int a=3;a<N;a++){
      // aの計算
      target = a;
      sumA = 0;
      for (int i=0;i<5;i++){
        sumA += target%10;
        target = target/10;
        if (target == 0) break;
      }
      // bの計算
      target = N-a;
      sumB = 0;
      for (int i=0;i<5;i++){
        sumB += target%10;
        target = target/10;
        if (target == 0) break;
      }

      
      if(sumA + sumB < min){
        min = sumA + sumB; 
      }
    }
    System.out.println(min);
  }
}