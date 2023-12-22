import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] m = new int[n];
    int min = 100000;
    int total = 0;
    for(int i = 0;i<n;i++){
      m[i] = sc.nextInt();
      min = Math.min(m[i],min);
      total += m[i];
    }
    x -= total;
    int count = n + x/min;
    System.out.println(count);
  }
}
