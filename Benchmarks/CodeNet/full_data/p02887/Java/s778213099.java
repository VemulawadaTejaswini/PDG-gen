import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner();
    int n = new sc.nextInt();
    int[] x = new int[n];
    int[] y = new int[n];
    for(int i = 0; i < n; i++){
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }
    long sum = 0;
    for(int i = 0; i < n; i++){
      for(int j = i + 1; i < n; j++){
        sum += Math.sqrt(1.0 * (x[j] - x[i]) * (x[j] - x[i]) + (y[j] - y[i]) * (y[j] - y[i]));
      }
    }
    System.out.println(sum * 2 / n);
  }
}