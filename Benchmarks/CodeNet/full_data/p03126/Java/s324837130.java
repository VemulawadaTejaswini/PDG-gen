import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    try {
      Scanner sc = new Scanner(System.in);
      int n, m, ans=0;

      n = Integer.parseInt(sc.next());
      m = Integer.parseInt(sc.next());

      int a[] = new int[m];

      for(int i=0; i<n; i++){
        int k = Integer.parseInt(sc.next());
        for(int j=0; j<k; j++){
          int ij = Integer.parseInt(sc.next());
          a[ij-1]++;
        }
      }
      
      for(int i=0; i<m; i++){
        if(a[i]==n){
          ans++;
        }
      }

      System.out.println(ans);
    }
    catch (Exception e) {
    }
  }
}
