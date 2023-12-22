import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int[] b = new int[a+1];
        int[] c = new int[a];
        for(int i=0;i<a+1;i++){
            int d=scan.nextInt();
            b[i]=d;
        }
        for(int i=0;i<a;i++){
            int d=scan.nextInt();
            c[i]=d;
        }
        long ans=0;
        for(int i=0;i<a;i++){
            if(c[i]<=b[i]){
                ans+=c[i];
            }else{
                c[i]-=b[i];
                ans+=b[i];
                b[i]=0;
                int e = i+1;
                if(c[i]<=b[e]){
                    ans+=c[i];
                    b[e]-=c[i];
                }else{
                    ans+=b[e];
                    b[e]=0;
                }
            }
        }
        System.out.println(ans);
    }
}