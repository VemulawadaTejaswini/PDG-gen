import java.io.*;
import java.util.*;



public class Main{
  
 public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] as = new int[N];
        int sum = 0;
        for(int i = 0; i < N;i++){
            as[i]=scanner.nextInt();
            sum += as[i]
        }
        sum -= N;
        System.out.println(sum);
    } 
  
  
  
  
  
}