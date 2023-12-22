import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] b = new int[a];
    int ans = 0;
    for(int i=0;i<a;i++){
      b[i] = sc.nextInt();
    }
    for(int i=0;i<a;i++){
      for(int j=i+1;j<a;j++){
        for(int k=j+1;k<a;k++){
          if( (b[i]<(b[j]+b[k])) & (b[j]<(b[i]+b[k])) & (b[k]<(b[i]+b[j])) ){
            ans++;
          }
        }
      }
    }
    System.out.println(ans);
  }
}