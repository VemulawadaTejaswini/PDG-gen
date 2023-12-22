import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    sc.close();
    double a = 0;
    int n1 = n;
    int ki = k;
    double kd = (double) k;
    double rate = 1;
    for (int i =0;i<k;i++){
      if (n1 == 0){
        break; 
      }else if (n1 >= ki){
        a += ((double)n1-(double)ki+1.0)*rate;
        n1 = ki-1;
      }
      kd = kd/2;
      ki = (int)Math.ceil(kd);
      rate = rate/2;
    }
    System.out.println(a/n);
  }
}