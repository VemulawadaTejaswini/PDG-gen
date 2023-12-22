

import java.util.Scanner;

public class Main {
    static long[][] aa;
    static long maxx(int ind,int[] arr,int k){
        if(k==0){
            return 1;
        }
//        if(ind>=arr.length && k==0){
//            return 1;
//        }

         if(ind>=arr.length ){
            return 0;
         }

        if(aa[ind][k]!=-1){
            return aa[ind][k];
        }
        long tot=0;
        for(int j=0;j<=arr[ind];j++){
            if(k-j<0){
                break;
            }
            tot=(tot+maxx(ind+1,arr,k-j))%(long)(Math.pow(10,9)+(long)7);
        }
        return aa[ind][k]=tot;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k= scanner.nextInt();
        int a[]=new int[n];
        for(int j=0;j<n;j++){
            a[j]=scanner.nextInt();
        }
        aa=new long[n][k+1];
        for(int j=0;j<n;j++){
            for(int i=0;i<=k;i++){
                aa[j][i]=-1;
            }
        }
        System.out.println(maxx(0,a,k));
    }


}
