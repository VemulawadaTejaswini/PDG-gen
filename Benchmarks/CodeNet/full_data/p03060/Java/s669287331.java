import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] V = new int [N];
        int[] C = new int [N];
        int[] P = new int [N];
        int t = 0;

        for(int i=1;i<=N;i++){
            V[i] = nextInt();
            C[i] = nextInt();
            P[i] = V[i]-C[i];

            if(P[i]>0){
                t+=P[i];
            }
        } 
    }
}