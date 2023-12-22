import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int M = sc.nextInt();
  int[] s = new int[2*M];
  boolean possible = false;
  for(int i = 0;i < 2*M;i++){
    s[i] = sc.nextInt();
  }
  out:
  for(int i = 0;i < 2*M -1;i += 2){
    if(s[i] == 1){
      for(int j = 1;j < 2*M;j += 2){
        if(s[j] == N && s[j-1] == s[i+1]){
          possible = true;
          break out;
        }
      }
    }
  }
  System.out.println(possible ? "POSSIBLE":"IMPOSSIBLE");
}}