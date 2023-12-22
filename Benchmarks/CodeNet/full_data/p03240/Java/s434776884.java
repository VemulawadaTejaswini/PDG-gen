import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] h = new int[n];
        for (int i=0;i<n;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            h[i]=sc.nextInt();
        }
        int count=0;
        String ans="";
        for (int i=0;i<=100;i++){
            for (int j=0;j<=100;j++){
                count++;
                int instance=0;
                boolean b = true;
                for (int k=0;k<n-1;k++){
                    if (h[k]!=0&&h[k+1]!=0){
                        int p = Math.abs(i-x[k])+Math.abs(j-y[k])+h[k];
                        int q = Math.abs(i-x[k+1])+Math.abs(j-y[k+1])+h[k+1];
                        if (h[k]!=0)instance=k;
                        if (h[k+1]!=0)instance=k+1;
                        if (p!=q)b=false;
                    }
                }
                if (b){
                    ans = i+" "+j+" "+(Math.abs(i-x[instance])+Math.abs(j-y[instance])+h[instance]);
                }
            }
        }
        int a=0;
        int b=0;
        for (int i=0;i<n;i++){
            if (h[i]==1){
                a=x[i];
                b=y[i];
            }
        }
        Arrays.sort(h);
        if (h[n-2]==0) {
            System.out.println(a+" "+b+" "+1);
        }else {
            System.out.println(ans);
        }
    }
}
