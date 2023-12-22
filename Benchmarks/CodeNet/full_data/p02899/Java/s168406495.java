import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int i=0;
        int A[]=new int[N];
        int B[]=new int[N];

        for(i=0;i<N;i++){
            A[i]=sc.nextInt();
            B[A[i]]=i;
        }

        for(i=0;i<N;i++){
            System.out.println(B[i]);
        }

        //END
    }
}

