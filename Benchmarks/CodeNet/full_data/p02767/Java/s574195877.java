import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] x = new int[n];
    long sum = Long.MAX_VALUE;
    for(int i = 0; i < n; i++){
      x[i] = sc.nextInt();
    }
    for(int i = 1; i <= 100; i++){
    	long temp = 0;
      for(int j = 0; j < n; j++){
        temp += Math.pow(x[j]-i,2);
      }
      if(sum > temp){
        sum = temp;
      }
    }
    System.out.println(sum);
  }
}