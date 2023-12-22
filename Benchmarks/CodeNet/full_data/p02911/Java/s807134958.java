import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //START

        Scanner n=new Scanner(System.in);
        int N=n.nextInt();

        Scanner k=new Scanner(System.in);
        int K=k.nextInt();

        Scanner q=new Scanner(System.in);
        int Q=q.nextInt();

        int i=0;
        int num=0;
        int A[]=new int[Q+10];
        int P[]=new int[N+10];

        for(i=0;i<N+10;i++){
            P[num]=0;
        }

        for(i=1;i<=Q;i++){
            Scanner inA=new Scanner(System.in);
            num=inA.nextInt();
            P[num]++;
        }

        for(num=1;num<=N;num++){
            if(P[num]>=Q-K+1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

        System.out.println(Q);


        //END
    }
}

