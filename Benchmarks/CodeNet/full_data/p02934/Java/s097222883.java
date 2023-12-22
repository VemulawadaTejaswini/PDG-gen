import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double[] a = new double[n];
    double d = 0.0;
    for(int i = 0;i<n;i++){
      a[i] = sc.nextDouble();
      d += 1/a[i];
    }
    System.out.println(1/d);      
  } 
}