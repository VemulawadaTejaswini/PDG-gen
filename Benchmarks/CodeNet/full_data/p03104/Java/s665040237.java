/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long K = sc.nextLong();
    long arr[] = new long[N];
    for(int i = 0 ;i<N; i++){
      arr[i] = sc.nextLong(); 
    }
    long pre = 0, ans = 0;
    for(int k = 40; k>=0; k--){
      if(((1L<<k)&K) != 0){
        long tot = 0;
        for(int j = 0; j<k; j++){
          int cnt = 0;
          for(int i = 0; i<N; i++){
            if((arr[i]&(1L<<j)) != 0){
              cnt++; 
            }
          }
          tot += (1L*Math.max(cnt, N-cnt)*(1L<<j));
        }
        for(int j = k; j<=40; j++){
          int cnt = 0;
          for(int i = 0; i<N; i++){
            if((arr[i]&(1L<<j)) != 0){
              cnt++; 
            }
          }
          if((pre&(1L<<j)) != 0){
            tot += (1L*(N-cnt)*(1L<<j)); 
          }
          else{
            tot += (1L*cnt*(1L<<j)); 
          }
        }
        ans = Math.max(tot, ans);
        pre += (1L<<k);
      }
    }
    long tot = 0;
    for(int i = 0; i<N; i++){
      tot += (K^arr[i]); 
    }
    ans = Math.max(ans, tot);
    System.out.println(ans);
  }
}
