fimport java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c[]=new int[n];
        int v[]=new int[n];
        
        for(int i=0;i<n;i++){
            c[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            v[i]=sc.nextInt();
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=(c[i]>v[i])?c[i]-v[i]:0;
        }
        System.out.println(ans);
        
    }
}