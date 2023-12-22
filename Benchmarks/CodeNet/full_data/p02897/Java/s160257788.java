import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    final int N=sc.nextInt();
    int[] array1=new int[N];
    int counter=0;
    for(int i=0;i<N;i++){
    	array[i]=i+1;
    }
    for(int i=0;i<N;i++){
    	if(array[i]%2==1){
        	counter++;
        }
    }
    double answer=counter/N;
    System.out.println(answer);
  }
}