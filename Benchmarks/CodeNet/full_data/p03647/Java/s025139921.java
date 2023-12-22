import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int M = sc.nextInt();
  int[] s = new int[2*M];
  int[] ps = new int[2*M];
  int counter = 0;
  for(int i = 0;i < 2*M;i++){
    s[i] = sc.nextInt();
  }
  for(int i = 0;i < 2*M -1;i += 2){
    if(s[i] == 1){
      ps[counter] = s[i];
      ps[counter+1] = s[i+1];
      counter += 2;
    }
  }
  int ncounter = 0;
  for(int i = 1;i < 2*M;i += 2){
    if(s[i] == N){
      ps[counter+2 + ncounter] = s[i-1];
      ps[counter+3 + ncounter] = s[i];
      ncounter += 2;
    }
  }
  boolean possible = false;
  out:
  for(int i = 0;i < counter+1;i += 2){
      for(int j = counter+3;j < counter + ncounter +2;j += 2){
        if(ps[i+1] == ps[j-1]){
          possible = true;
          break out;
        }
      }
    }
  System.out.println(possible ? "POSSIBLE":"IMPOSSIBLE");
}}
