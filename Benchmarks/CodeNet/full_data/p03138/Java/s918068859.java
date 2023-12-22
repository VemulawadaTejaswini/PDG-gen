import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long K = sc.nextLong();
    long max = 0;
    long box[]=new long[N];
    for(int l=0;l<N;l++){
      box[l]=sc.nextLong();
    }

    for(int i=0;i<=K;i++){
      long sum=0;
      for(int l=0;l<N;l++){
        sum+=i^box[l];
      }
      if(max<sum)max=sum;
    }
    System.out.println(max);
  }
}