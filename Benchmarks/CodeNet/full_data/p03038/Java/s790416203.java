import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
       
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        ArrayList <Integer> A = new ArrayList <Integer>();
        
        for (int index=0; index<N; index++){
            A.add(sc.nextInt());
        }

        Collections.sort(A);
        
        for (int index=0; index<M; index++){
            int B = sc.nextInt();
            int C = sc.nextInt();
            
            for (int index2=0; index2<B; index2++){
                if (A.get(0)<C){
                    A.set(0,C);
                    A=sort(A,N);
                } else {
                    break;
                }
            }
        }
        
        long sum = 0;
        
        for (int index=0; index<N; index++){
            sum+=A.get(index);
        }
        
        System.out.println(sum);
    }
    
    private static ArrayList <Integer> sort (ArrayList <Integer> A, int N){
        
        for (int index=0; index+1<N; index++){
            if (A.get(index)>A.get(index+1)){
                int temp = A.get(index+1);
                
                A.set(index+1, A.get(index));
                A.set(index,temp);
            } else {
                break;
            }
        }
        
        return A;
    }
}