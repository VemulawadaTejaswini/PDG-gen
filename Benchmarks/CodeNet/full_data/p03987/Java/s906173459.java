import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    int i;
    int N = scanner.nextInt();
    long[] numbers = new long[N];
   
    for(i=0; i<N; i++) {
      numbers[i] = scanner.nextLong();
    }
    
    int r = 0;
    int l = 0;
    long sum = 0;
    
    for(l=1; l<=N; l++) {
      for(r=l; r<=N; r++) {
        
        long min = N+1;
        for(int k=l; k<=r; k++) {
          if(numbers[k-1] < min) 
            min = numbers[k-1]; 
        }
        sum += min;
      }
    }
    
    System.out.println(sum);
  }
}