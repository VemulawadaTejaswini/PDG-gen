import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] a = new int[3*n];
    for(int i=0; i<a.length; i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    int sum = 0;
    for(int i=n; i<2*n; i++){
      sum += a[i];
    }
    System.out.println(sum);

    sc.close();
  }
}