import  java.util.*;
class Main {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),x=sc.nextInt();
        int[] a =new int[1000];
        for(int i=0;i<m;i++)a[sc.nextInt()]++;
        long ans1 =0,ans2=0;
        for(int i=x-1;i>0;--i){
            if(a[i]>0)
                ans1++;
        }
        for (int i=x+1;i<n;i++){
            if(a[i]>0)ans2++;
        }
        System.out.println(Math.min(ans1,ans2));
    }
}