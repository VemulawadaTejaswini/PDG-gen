import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int count = 0;
    int[] ar = new int[n];
    for(int i=0;i<n;i++){
      ar[i] = sc.nextInt();
    }
    for(int j=0;j<n;j++){
      if(ar[j] >= k){
        count++;
      }
    }
    System.out.println(count);
  }
}