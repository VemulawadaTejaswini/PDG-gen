import java.util.Scanner;
public class Main {
    private static Scanner sc=new Scanner(System.in);
    private static int p=sc.nextInt();
    private static int[] a=new int[p];
    public static void main(String[] args){
        for(int i=0;i<p;i++){
            a[i]=sc.nextInt();
        }
        quicksort(a,0,p-1);
        boolean possible=true;
        long ans=0;
        if(p%2==0){
            for(int i=0;i<p/2;i++){
                if(a[2*i]!=2*i+1) possible=false;
                if(a[2*i+1]!=2*i+1) possible=false;
            }
            if(possible){
                ans=1;
                for(int i=0;i<p/2;i++){
                    ans=(ans*2)%1000000007;
                }
            }
        }
if(p%2==1){
            if(a[0]!=0) possible=false;
            for(int i=0;i<p/2;i++){
                if(a[2*i+1]!=2*i+2) possible=false;
                if(a[2*i+2]!=2*i+2) possible=false;
            }
            if(possible){
                ans=1;
                for(int i=0;i<p/2;i++){
                    ans=(ans*2)%1000000007;
                }
            }
        }
        System.out.println(ans);
    }
private static void quicksort(int[] a,int left,int right){
        if(left<=right){
            int pv=a[(left+right)/2];
            int l=left;
            int r=right;
            while(l<=r){
                while(a[l]<pv) l++;
                while(a[r]>pv) r--;
                if(l<=r){
                    int temp=a[l];
                    a[l]=a[r];
                    a[r]=temp;
                    l++;
                    r--;
                }
                quicksort(a,left,r);
                quicksort(a,l,right);
            }
        }
    }
}