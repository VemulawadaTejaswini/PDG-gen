import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int x[][] = new int[n][d];
    int count = 0;
    for(int i=0 ; i<n ; i++){
      for(int j=0 ; j<d ; j++){
        x[i][j] = sc.nextInt();
      }
    }

    for(int i=0 ; i<n ; i++){
      for(int j=i+1 ; j<n ; j++){
        int ans = 0;
        for(int k=0 ; k<d ; k++){
          int a = Math.abs(x[i][k]-x[j][k]);
          ans = ans + a*a;
        }
        for(int k=0 ; k<=ans ; k++){
          if(ans == k*k){
            count++;
          }
        }
      }
    }
    System.out.println(count);
  }
}
