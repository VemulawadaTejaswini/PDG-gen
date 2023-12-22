import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int ans=0;
        double[] x = new double[a*b];
        for(int l=0;l<b;l++){
            x[l]=scan.nextDouble();
        }
        for(int i=0;i<a-1;i++){
            double e = 0;
            for(int l=b*i;l<b*(i+1);l++){
                x[l+b]=scan.nextDouble();
                e+=Math.pow(Math.abs(x[l+b]-x[l]),2);
            }
            if(Math.sqrt(e)%1==0)ans++;
        }
        double e = 0;
        for(int l=0;l<b;l++){
            e+=Math.pow(Math.abs(x[(a-1)*b+l]-x[l]),2);
        }
        e=Math.sqrt(e);
        if(e%1==0)ans++;
        System.out.println(ans);
    }
}