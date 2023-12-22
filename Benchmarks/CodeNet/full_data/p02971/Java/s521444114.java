import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int max = 0;
        int sub = 0;
        int c = 0;

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++){
            if(max <= A[i]){
                max = A[i];
                c = i;
            }
        }

        for(int i = 0; i < N; i++){
            if(i == c){
                continue;
            }
            if(sub <= A[i]){
                sub = A[i];
            }
        }

        for(int i = 0; i < N; i++){
            if(i == c){
                System.out.println(sub);
            }else{
                System.out.println(max);
            }
        }
        
    }

}