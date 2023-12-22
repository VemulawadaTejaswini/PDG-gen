import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int M = sc.nextInt();
    int C = sc.nextInt();
    int Nums[]=new int[M];
    int sum=0;
    int AB=0;
    int count=0;
     int Source[][]=new int[A][M];
    for(int i=0;i<M;i++){
    	Nums[i]=sc.nextInt();
    }
     for(int i=0;i<A;i++){
       for(int j=0;j<M;j++)
    	Source[i][j]=sc.nextInt();
    }
    for(int i=0;i<A;i++){
      sum=0;
       for(int j=0;j<M;j++){
    	AB=Source[i][j]*Nums[j];
         sum+=AB;
   	 }
      sum+=C;
      if(sum>0){
      count++;
      }
    }
    System.out.println(count);
  }
}