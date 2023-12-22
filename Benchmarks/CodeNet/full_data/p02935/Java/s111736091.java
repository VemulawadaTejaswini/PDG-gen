import java.util.Scanner;
import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int v[] = new int[N];
    
    for(int i=0;i<N;i++){
      v[i] = sc.nextInt();
    }
    
    Arrays.sort(v);
    double sum = 0;
    for(int j=0;j<N;j++){
      if(j==0){
       sum = v[j];
      }else{
       sum = (sum+v[j])/2.0;
      }
    }
    System.out.println(sum);
    
  }
}