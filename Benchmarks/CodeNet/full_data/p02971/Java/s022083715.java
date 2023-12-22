import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int max = 0;

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
               if(j == i){
                    continue;
               } 
               
               if(max <= A[j]){
                    max = A[j];
               }

            }
            System.out.println(max);
            max = 0;
        }
        
    }

}