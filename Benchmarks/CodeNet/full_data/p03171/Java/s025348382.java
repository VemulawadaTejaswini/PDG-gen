

import java.util.Scanner;

public class Main {
    static long[][] aa;
    static long maxx(int ind1,int ind2,int[] arr,int flag){
        if(ind1>=arr.length || ind2<0 || ind1>ind2){
            return 0;
        }
        if(ind1==ind2){
            return arr[ind1];
        }
        if(aa[ind1][ind2]!=-1){
            return aa[ind1][ind2];
        }
        //if(flag==0){
            return aa[ind1][ind2]=Math.max( -maxx(ind1+1,ind2,arr,1)+(long)arr[ind1],-maxx(ind1,ind2-1,arr,1)+(long)arr[ind2]  );
      //  }
//        else{
//            return aa[ind1][ind2][flag]=Math.min(maxx(ind1+1,ind2,arr,0),maxx(ind1,ind2-1,arr,0));
//        }


    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] a=new int[n];
        long sum=0;
        for(int j=0;j<n;j++){
            a[j]= scanner.nextInt();
            sum=(long)((long)sum+(long)a[j]);
        }
        aa=new long[n][n];
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
               // for(int k=0;k<2;k++){
                    aa[j][i]=-1;
                //}
            }
        }
        //System.out.println(-(long)sum+(long)2*(long)maxx(0,n-1,a,0));
       System.out.println(maxx(0,n-1,a,0));
    }

}
