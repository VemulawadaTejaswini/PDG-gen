import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt()-1;
        int k=sc.nextInt();
        int[]po=new int[k];
        for(int i=0;i<k;i++)po[i]=sc.nextInt();
        Arrays.sort(po);
        int p[]=new int[k-1];
        for(int i=0;i<k-1;i++)p[i]=po[i+1]-po[i];
        Arrays.sort(p);
        int ans=po[k-1]-po[0];
        if(n>=k+1)System.out.println(0);
        else{
            for(int i=0;i<n;i++)ans-=p[k-2-i];
            System.out.println(ans);
        }
    }
}
