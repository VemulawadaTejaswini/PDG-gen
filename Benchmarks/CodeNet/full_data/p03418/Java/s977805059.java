import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int     N    = scan.nextInt();
      int     K    = scan.nextInt();
      long    coun = 0;


      for(int i = 1; i <= N; i++){
          if(i > K){
             coun += (N / i) * (i - K) >= 0 ? (N / i) * (i - K) : 0;

             coun += (N % i) - K + 1 >= 0 ? (N % i) - K + 1 : 0;
             }
          }
      if(K == 0){
         coun = N * N;
         }
      System.out.println(coun);
   }
}
