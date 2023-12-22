import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] health = new int[n];
    for(int i = 0; i < n; i++){
      health[i] = sc.nextInt();
    }
    Arrays.sort(health);
    Long total = 0L;
    for(int i = 0; i < n - k; i++){
      total += health[i];
    }
    System.out.println(total);
  }
}