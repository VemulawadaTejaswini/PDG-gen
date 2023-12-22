import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Q = sc.nextInt();
    String S = sc.next();
    int count = 0;
    int[] Time = new int[N+1];
    int[] r = new int[Q];
    int[] l = new int[Q];
    Time[0] = 0;
    for(int i=1; i<N; i++){
      if(i!=N && S.charAt(i)=='A' && S.charAt(i+1)=='C'){
        count++;
      }
      Time[i] = count;
    }
    
    for(int i=0; i<Q; i++){
      r[i] = sc.nextInt();
      l[i] = sc.nextInt();
    }
    
    for(int i=0; i<Q; i++){
      System.out.println(Time[l[i]-1] - Time[r[i]-1]);
    }
  }
}