import java.util.Scanner;

public class Main{
  static int N,M,C,count,subcount,A;
  static int[] B;
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    M = sc.nextInt();
    C = sc.nextInt();
    B = new int[M];
    for(int i=0;i<M;i++){
      B[i]=sc.nextInt();
    }
    for(int i=0;i<N;i++){
		for(int j=0;j<M;j++){
          A = sc.nextInt();
          subcount += B[j]*A;
        }
      if(subcount+C>0){
        count++;
      }
      else{
      }
      subcount = 0;
    }
    System.out.println(count);
  }

}