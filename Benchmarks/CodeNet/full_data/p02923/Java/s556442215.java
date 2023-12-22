import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] box = new int[a];
    int ans = 0;
    for(int i=0;i<a;i++){
      box[i] = sc.nextInt();
    }
    for(int i=a-1;i>1;i--){
      if(box[i]<=box[i-1]){
        ans++;
      }
    }
    System.out.println(ans);
  }
}