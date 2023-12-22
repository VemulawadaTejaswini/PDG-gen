import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = Integer.parseInt(scan.next());
    int K = Integer.parseInt(scan.next());
    int Q = Integer.parseInt(scan.next());
    int[] scores = new int[N];
    int[] who = new int[Q];
    int[] ones = new int[N];
    for(int i = 0; i < Q; i++){
      who[i] = scan.nextInt();
    }
    for(int i = 0; i < Q; i++){
      scores[who[i]-1] = scores[who[i]-1]+1;
    }
    for(int n = 0; n < N; n++){
      if((K - Q + scores[n]) <= 0){System.out.println("No");}
      else{System.out.println("Yes");}
    }
  }
 }