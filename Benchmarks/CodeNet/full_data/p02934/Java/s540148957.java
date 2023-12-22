import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    double[] array = new double[n];
    double a, sum = 0 ;

    for(int i=0; i<n; i++){
      a = sc.nextInt();
      a = 1 /(double)a;
      sum += a;
    }
    sum = 1 /sum ;
    System.out.println(sum);
  }

}
