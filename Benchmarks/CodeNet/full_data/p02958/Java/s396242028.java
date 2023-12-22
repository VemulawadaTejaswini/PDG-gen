import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int[]po=new int[n];
        for(int i=0;i<n;i++){
            po[i]=sc.nextInt();
        }
        boolean t=false;
        PO:for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++){
               int b[]= swap(po.clone(),i,j);
               t=true;
               for(int k=1;k<n;k++){
                   if(b[k-1]>b[k]){
                       t=false;
                       //break;
                   }
               }
               if(t)break PO;
            } 
            
        }
        System.out.println(t?"YES":"NO");
    }
    public static int[] swap(int[]a,int x,int y){
        x=Math.abs(x);
        y=Math.abs(y);
        if(a.length>x&&a.length>y){
            int po=a[x];
            a[x]=a[y];
            a[y]=po;
        }
        return a;
    }
}
