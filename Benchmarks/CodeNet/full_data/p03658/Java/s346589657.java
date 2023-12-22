import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int l[] = new int[N];
    for(int i=0;i<N;i++){
      l[i]=sc.nextInt();
    }
    int answer =0;
    Arrays.sort(l);
    for(int i=1;i<=K;i++){
      answer = answer+l[N-i];
    }
    System.out.println(answer);
  }
  

  
}