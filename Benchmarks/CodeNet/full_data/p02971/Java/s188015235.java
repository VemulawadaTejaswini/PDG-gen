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
    //Integer max[] = new Integer[n];
    int max = 0;
    for(int i=0;i<n;i++){
      max = 0;
      for(int j = 0; j<n;j++){
        if(j==i) continue;
        if(a[j] >= max){
          max = a[j];
        }
      }
        System.out.println(max);
      }



      // for(int i=0;i<n;i++){
      //   if(max[i]<=a[i]){
      //     System.out.println(a[i]);
      //
      //   }else{
      //   }
      // }



  }
}
