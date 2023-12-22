import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d[] = new int[n];
    int a,total = 0;

    for(int i=0 ; i<n ; i++){
      d[i] = sc.nextInt();
    }

    for(int i=0 ; i<n ; i++){
      for(int j=i+1 ; j<n ; j++){
        a = d[i] * d[j];
        total = total + a;
      }
    }
    System.out.println(total);
  }
}
