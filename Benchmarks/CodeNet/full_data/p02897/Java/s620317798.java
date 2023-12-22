import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    final int N=sc.nextInt();
    int[] array=new int[N+1];
    int counter=0;
    for(int i=0;i<N+1;i++){
      array[i]=i+1;
    }
    for(int i=0;i<N+1;i++){
      if(array[i]%2==1){
        counter++;
      }
    }
    double answer=counter/N+1;
    System.out.println(answer);
  }
}