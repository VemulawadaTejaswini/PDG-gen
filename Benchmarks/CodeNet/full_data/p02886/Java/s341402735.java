import java.util.*;

public class Main{
  pubic static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    final int N=sc.nextInt();
    int[] d=new int[N];
    for(int i=0;i<N;i++){
      d[i]=sc.nextInt();
    }
    int counter=0;
    int answer=0;
    while(counter<N){
      for(int i=0;i<N-1;i++){
        answer=answer+d[i]*d[i+1];
      }
      counter++;
    }
    System.out.println(answer);
  }
}