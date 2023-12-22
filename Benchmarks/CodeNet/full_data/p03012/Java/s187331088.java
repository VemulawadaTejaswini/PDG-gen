import java.util.*;
//import java.io.*;


public class Main{

    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try{
            // int n = Integer.parseInt(br.readLine());

        int n =sc.nextInt();
        int[] w = new int[n];
        for(int i=0;i<n;i++){
            w[i]=sc.nextInt();
        }
        sc.close();

        int formerPartSum[]= new int[n+1];
        int latterPartSum[]= new int[n+1];

        formerPartSum[0]=0;
        for(int i=0;i<n;i++){
            latterPartSum[0]+=w[i];
        }

        int minAbs=Math.abs(latterPartSum[0]-formerPartSum[0]);

        for(int i=0;i<n;i++){
            latterPartSum[i+1]=latterPartSum[i]-w[i];
            formerPartSum[i+1]=formerPartSum[i]+w[i];
            int minAbsCandidate=Math.abs(latterPartSum[i]-formerPartSum[i]);
            minAbs= minAbs<=minAbsCandidate?minAbs:minAbsCandidate;
        }
        System.out.println(minAbs);
    }


}