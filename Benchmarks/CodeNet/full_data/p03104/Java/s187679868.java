import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long M = Long.parseLong(sc.next());
      long N = Long.parseLong(sc.next());

      long ans = 0;
      long start = 0;
      long end = 0;
      for(long i=M;i<=N;i++){
          if((i&(i-1))==0){
              start = i;
              break;
          }
      }
      for(long i=N;i>=M;i--){
          if((i&(i-1))==0){
              end = i;
          break;
          }
      }
      if(start==end){
          for(long i=M;i<=N;i+=2){
              if(i==N){
                  ans ^= i;
              }
              else{
                  long a = i^(i+1);
                  ans ^= a;
              }
          }
      }
      else{
          for(long i=M;i<=N;i++){
              ans ^= i;
              if(i==start-1){
                  i = end-1;
              }
          }
      }


    System.out.println(ans);

    }
}
