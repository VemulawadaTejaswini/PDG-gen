import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  int K = sc.nextInt();
  int S = sc.nextInt();
  int counter = 0;
  for(int i = 0;i <= K;i++){
    for(int j = 0;j <= K;j++){
        if(S-i-j >=0 && S-i-j <= K)counter++;
      }
    }
  }
  System.out.println(counter);
}}
