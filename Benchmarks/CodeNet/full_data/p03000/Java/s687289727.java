import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int l[] = new int[n];
    int d[] = new int[n];
    int count = 1;
    for(int i=0 ; i<n ; i++){
      l[i] = sc.nextInt();
    }
    for(int i=0 ; i<n ; i++){
      if(i==0){
        d[0]=0;
      }else{
        d[i] = d[i-1] + l[i-1];
      }
      // System.out.println(d[i]);
    }
    for(int i=1 ; i<n ; i++){
      if(d[i]<=x){
        count++;
      }else{
        break;
      }
    }
    System.out.println(count);
  }
}
