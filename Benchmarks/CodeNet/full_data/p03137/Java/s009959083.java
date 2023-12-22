import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        if(checkM(m)){
            return;
        }
        
        int[] x = new int[m];
        for(int i=0;i<x.length;i++)
        {
            x[i] = scan.nextInt();
        }
        
        Arrays.sort(x);
        int[] y = new int[m-1];
        for(int i=0;i<y.length;i++)
        {
            y[i] = Math.abs(x[i+1] - x[i]);
            // System.out.print(y[i]);
        }
        Arrays.sort(y);
        int ans = x[m-1]-x[0];
        int count = 1;
        while(count<n)
        {
            ans -= y[m-1-count];
            count++;
        }
        System.out.println(ans);
        
    }
    
    static boolean checkM(int m)
    {
        if(m==1)
        {
            System.out.println(0);
            return true;
        }
        
        return false;
    }
}