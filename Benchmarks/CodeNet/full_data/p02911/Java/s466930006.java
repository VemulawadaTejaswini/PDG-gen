import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int Q=sc.nextInt();

        int i=0;
        int num=0;
        //int A[]=new int[N+10];
        int P[]=new int[N+10];

        for(i=0;i<N+10;i++){
            P[num]=0;
        }

        for(i=1;i<=Q;i++){
            num=sc.nextInt();
            P[num]++;
        }

        for(num=1;num<=N;num++){
            if(P[num]>=Q-K+1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }


        //END
    }
}

