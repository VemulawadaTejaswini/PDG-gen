import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int a = scan.nextInt();
    int b = scan.nextInt();
    int siguma = 0;

    for(int i = 1; i <= n; i++){
      int sum = 0;
      int j = i;
      while(j > 0){
        sum += j%10;
        j /= 10;
      }
      if(a <= sum && sum <= b)
        siguma += i;
    }
    System.out.println(siguma);
  }
}
