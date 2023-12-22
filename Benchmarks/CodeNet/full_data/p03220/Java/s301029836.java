import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double T = sc.nextInt();
    double A = sc.nextInt();
    double f = 12000;
    int result = 0;
    for(int i=0; i<N; i++){
      double H = sc.nextInt();
      double avg = T - H*0.006;
      if(f > Math.abs(A - avg)){
        f = Math.abs(A - avg);
        result = i;
      }
    }
    System.out.println(result + 1);
  }
}