import java.util.*;
import java.io.*;


class Main {
  public static void main(String[] args){
    Scanner  sc = new Scanner(System.in);
    int n = sc.nextInt();
    Integer a[] = new Integer[n];
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    int max = 0;
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(j == i) continue;
        if(a[i] <= a[j]){
          max = a[j];
        }


      }
      System.out.println(max);
    }

  }
}
