import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    int[] taste = new int[n];
    int sum = 0;
    int abs_min = 512;
    int abs_min_index = 512;

    for(int i=0; i<n; ++i) {
      taste[i] = l + (i+1) - 1;
      sum += taste[i];
      if( Math.abs(taste[i]) < abs_min ) {
        abs_min = Math.abs(taste[i]);
        abs_min_index = i;
      }
    }

    sum -= taste[abs_min_index];
    System.out.println(sum);
  }
}