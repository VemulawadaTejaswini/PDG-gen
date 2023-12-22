import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = Integer.parseInt(scan.next());
    int K = Integer.parseInt(scan.next());
    int Q = Integer.parseInt(scan.next());
    int[] scores = new int[N];
    int[] who = new int[Q];
    for(int i = 0; i < Q; i++){
      who[i] = scan.nextInt();
    }
    for(int i = 0; i < N; i++){
      scores[i] = K;
    }
    for(int m = 0; m < Q; m++){
      for(int n = 0; n < N; n++){
        if(n == who[m]-1){continue;}
        else{
          scores[n] = scores[n]-1;
        }
      }
    }
    for(int n = 0; n < N; n++){
      if(scores[n] <= 0){System.out.println("No");}
      else{System.out.println("Yes");}
    }
  }
 }