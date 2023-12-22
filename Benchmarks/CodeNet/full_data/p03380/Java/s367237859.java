import  java.util.*;

 class Main {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] a =new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
//        Arrays.sort(a);
        long ans=0,val=0;
        int p1=0,p2=0;
        for (int j=0;j<n;j++){
            for (int i=0;i<n;i++){
                if (a[j]>a[i]) {
                    val = ncr(a[j], a[i]);
                    if (val>ans){
                        p1=a[j];
                        p2=a[i];
                        ans=val;
                    }
                    //System.out.println(val);
                }

            }
        }
        System.out.println(p1+" "+p2);
    }

    public static long ncr(int n,int r){
        long[] p=new long[r+1];
        p[0]=1;
        for (int i=1;i<=n;i++)
            for (int j=Math.min(i,r);j>0;--j)
                p[j]=p[j]+p[j-1];
        return p[r];
    }

}