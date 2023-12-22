import java.util.*;
    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            long A = sc.nextLong()L;
            long B = sc.nextLong()L;
            long C = A;
            for(int i=0; i<B-A; i++){
                A = A*(C+1);
                C++;
            }

           if(A == 0){
                System.out.println("Zero");
           }else if(A>0){
                System.out.println("Positive");
          }else if(A<0){
                System.out.println("Negative");
         }
    }
}
               
