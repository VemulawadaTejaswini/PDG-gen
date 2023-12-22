

import java.util.Scanner;

public class Main {
    static long st[];
    static long constructSTUtil(int arr[],int ss,int se,int si){
        if(se==ss){
            st[si]=arr[ss];
            return arr[ss];
        }
        int mid=getMid(ss,se);
        st[si]=constructSTUtil(arr,ss,mid,si*2+1)+constructSTUtil(arr,mid+1,se,si*2+2);
        return st[si];
    }
    static int getMid(int s,int e){
        return s+(e-s)/2;
    }
    static long getSumUtil(int ss,int se,int qs,int qe,int si){

        if(qs<= ss && qe>=se){
            return st[si];
        }
        if(se<qs || ss>qe){
            return 0;
        }

        int mid=getMid(ss,se);
        return getSumUtil(ss,mid,qs,qe,2*si+1)+getSumUtil(mid+1,se,qs,qe,2*si+2);
    }
    static long getSum(int n,int qs,int qe){
        if(qs < 0 || qe > n-1 || qs > qe){
            return -1;
        }
        return getSumUtil(0,n-1,qs,qe,0);
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        long s=scanner.nextLong();
        int arr[]=new int[n];
        for(int j=0;j<n;j++){
            arr[j]=scanner.nextInt();
        }
        int x=(int) (Math.ceil(Math.log(n)/Math.log(2)));
        int max_size= (int) (2*(Math.pow(2,x))-1); // maximum size of segment tree
        st= new long[max_size];
        st[0]=constructSTUtil(arr,0,n-1,0);
        int mat[][] =new int[n][n];

        int ff=0;
        for(int j=0;j<n;j++){
            for(int i=j;i<n;i++){
                long ss=getSum(n,j,i);
                if(ss==s){
                    mat[j][i]=1;
                    ff=1;
                }
            }
        }
        if(ff==0){
            System.out.println(0);
        }
        else {
            long sum = 0;
            for (int j = 0; j < n; j++) {

                for (int i = j; i < n; i++) {

                    for (int ii = j; ii <= i; ii++) {

                        for (int kk = ii; kk <= i; kk++) {
                            if (mat[ii][kk] == 1) {
                                sum = (sum + 1);
                                sum=sum%(long) 998244353;
                            }
                        }


                    }
                }
            }
            System.out.println(sum);
        }

    }

}
