import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    double min = 100;
    int a[] = new int[n];
    for(int i = 0 ; i < n ; ++i){
      a[i] = sc.nextInt();
      sum += a[i];
    }
    double ave = sum/n;
    int num = 0;
    for(int i = 0 ; i < n ; ++i){
      if(Math.abs(a[i]-ave) < min){
        min =Math.min(Math.abs(a[i]-ave),min);
        num = i;
      }
    }
    
    
    System.out.println(num);
    
  }
}