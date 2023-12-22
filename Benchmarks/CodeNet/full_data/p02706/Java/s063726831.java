import java.util.*;

class Main{
    public static void main(String args[]){
         Scanner S =  new Scanner(System.in);
         int N = Integer.parseInt(S.next());
         int M = Integer.parseInt(S.next());
         int total = 0;
         for(int i=0;i<M;i++){
             total += Integer.parseInt(S.next());
         }

         if(N >= total){
             System.out.println(N-total);
         } else {
             System.out.println(-1);
         }

    }
}
