import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        int d[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            c[i]=sc.nextInt();
            d[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            long min=Math.abs(c[0]-a[i])+Math.abs(d[0]-b[i]);
            int ans=1;
            for(int j=1;j<m;j++){
                long len=Math.abs(c[j]-a[i])+Math.abs(d[j]-b[i]);
                if(min>len){
                    ans=j+1;
                    min=len;
                }
            }
            System.out.println(ans);
        }
       

    }
}
