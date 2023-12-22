import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] a1=new int[n];
    int ans = 0;
    
    for(int i=0;i<n;i++){
      a1[i]=sc.nextInt();
    }
    int[] total =new int[n];
    total[0] = a1[0];
    for(int j=1;j<n;j++){
      total[j] = total[j-1] + a1[j]; 
    }
    
    for (int k = n-1; k < 0; k--) {
      if (total[k] % 10 != 0) {
        ans = total[k];
        break;
      }
    }
    System.out.println(ans);
  }
}
