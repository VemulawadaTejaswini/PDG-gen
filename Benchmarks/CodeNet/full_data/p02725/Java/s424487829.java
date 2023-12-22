import java.util.*;
import java.math.*;

class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int min = K;
        int index = 0;
        for(int i = 0; i < N - 1; i++){
            if(min > A[i] - A[i+1]){
                min = A[i] - A[i+1];
                index = i;
            }
        }
        int tokei = 0;
int tokeidx = index;
int hantokeidx= index;
        int hantokei = 0; 
        for(int i = 0; i < N-1; i++){
            if(tokeidx + 1 < N){
                tokei -= A[tokeidx] - A[tokeidx + 1];
                tokeidx++;
            }else{
                tokei += A[0] - A[tokeidx] + K;
                tokeidx = 0;
            } 
        }
        for(int i = 0; i < N-1; i++){
            if(hantokeidx!=  0){
                hantokei += A[hantokeidx] - A[hantokeidx- 1];
                hantokeidx--;
            }else{
                hantokei -=  A[N - 1] - A[0] - K;
                hantokeidx= N - 1;
            } 
        }

        if(tokei >= hantokei){
            System.out.print(hantokei);
        }else{
            System.out.print(tokei);
        }
	}

}