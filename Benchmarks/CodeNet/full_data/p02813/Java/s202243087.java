import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }
    for(int i = 0; i < n; i++){
      b[i] = sc.nextInt();
    }
    int[] difA = dif(n, a);
    int[] difB = dif(n, b);
    int output = 0;
    for(int i = 0; i < n; i++){
      output += (difA[i] - difB[i]) * fac(n - i - 1);
    }
    System.out.println(Math.abs(output));
  }
  public static int[] dif(int n, int[] seq){
    List<Integer> ideal = new ArrayList<>();
    int[] dif = new int[n];
    for(int i = 1; i <= n; i++){
      ideal.add(i);
    }
    for(int i = 0; i < n; i++){
      int index = ideal.indexOf(seq[i]);
      dif[i] = index;
      ideal.remove(index);
    }
    return dif;
  }
  public static int fac(int n){
    int fac = 1;
    if(n == 0){
      return 1;
    }
      for(int i = n; i >= 1; i--){
        fac *=  i;
      }
      return fac;
  }
}