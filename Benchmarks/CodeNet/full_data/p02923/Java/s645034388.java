import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
  public static void main(String[] arrgs){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    //scan.next();
    int[] H = new int[N];
    int max=0;
    for(int i=0;i<N;i++){
        H[i] = scan.nextInt();
    }
    for(int s = 0;s<N-1;s++){
      int n = 0;
      while(H[s]>=H[s+1]){
        s = s+1;
        n++;}
      if(n>max){
        max = n;
      }
    }
    System.out.println(max);
  }
}
      