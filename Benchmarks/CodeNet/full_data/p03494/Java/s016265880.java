import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            b[i] = Counthalf(a[i]);
        }
        
        System.out.println(ArrayMin(b));
    }
    
    static int Counthalf(int a){
        int count = 0;
        while(a>1)
        {
            if(a%2==1)
            {
                return count;
            }
            else
            {
                a /= 2;
                count++;
            }
        }
        return count;
    }
    
    static int ArrayMin(int[] a){
        int min = 1000000000;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min = a[i];
            }
        }
        return min;
    }
}