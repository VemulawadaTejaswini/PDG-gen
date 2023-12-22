import java.io.*;
import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int h[] = new int[N+1];
    for(int i = 1; i<=N; i++){
      h[i] = sc.nextInt(); 
    }
    int cnt = 0;
    for(int i = 1; i<=N; i++){
      boolean canseeocean = true;
      for(int j = 1; j<i; j++){
        if(h[j] > h[i]){
          canseeocean = false; 
        }
      }
      if(canseeocean){
        cnt++; 
      }
    }
    System.out.println(cnt);
  }
}
