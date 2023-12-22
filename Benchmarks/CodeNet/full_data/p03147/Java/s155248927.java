import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] h = new int[n];
    for(int i = 0;i<n;i++){
      h[i] = sc.nextInt();
    }

    int count = 0;
    int start = 0;
    while(start < n){
      if(h[start]==0){
        start++;
        continue;
      }
      count++;
      h[start]--;
      for(int i = start+1;i<n;i++){
        if(h[i]==0){
          break;
        }
        h[i]--;
      }
    }
    System.out.println(count);
  }
}
