import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v[]=new int[n];
        int c[]=new int[n];
        int ans=0;
        for(int i=0; i<n; i++)
            v[i]=sc.nextInt();
        for(int i=0; i<n; i++){
            c[i]=sc.nextInt();
            if(v[i]>c[i])
                ans+=(v[i]-c[i]);
        }
        System.out.println(ans);
    }
}
