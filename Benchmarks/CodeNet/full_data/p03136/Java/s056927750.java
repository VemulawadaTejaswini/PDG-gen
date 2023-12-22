import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    int[] ar = new int[n];
    for(int i=0;i<n;i++){
      ar[i] = sc.nextInt();
    }
    int max = ar[0];
    for(int j=1;j<n;j++){
      if(max < ar[j]){
        max = ar[j];
      }
    }
    for(int k=0;k<n;k++){
      sum += ar[k];
    }
    if(max < sum - max){
      System.out.println("Yes");
    } else if (max >= sum - max){
      System.out.println("No");
  }
}
}