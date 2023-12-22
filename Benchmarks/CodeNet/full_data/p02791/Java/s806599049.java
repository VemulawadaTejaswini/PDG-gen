import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int P[] = new int[N];
    int min = 0;
    int answer = 0;
    for(int i=0;i<N;i++){
      P[i]=sc.nextInt();
    }
    min = P[0];
    answer = answer+1;
    for(int i=1;i<N;i++){
      if(P[i]<min){
        answer=answer+1;
        min=P[i];
      }
    }
    System.out.println(answer);
  }
  

  
}