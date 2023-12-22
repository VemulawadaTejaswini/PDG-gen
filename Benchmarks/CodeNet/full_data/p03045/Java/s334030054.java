import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int []po=new int[n+1];
        for(int i=0;i<m;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(po[x]==0)
                if(po[y]==0){
                    po[x]=x;
                    po[y]=x;
                }
                else
                    po[x]=po[y];
            else
                if(po[y]==0)
                    po[y]=po[x];
                else
                    po[po[y]]=po[x];
            sc.nextInt();
        }
        int count=0;
        for(int i=1;i<=n;i++)
            if(po[i]==i||po[i]==0)count++;
        System.out.println(count);
    }
}
