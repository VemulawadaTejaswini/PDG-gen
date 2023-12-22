import java.util.*;

public class Main{

    static int comb(int m,int n)
    {
        int res=1;
 
        if(n>m-n)
            n=m-n;
 
        for(int i=0;i<n;i++)
        {
            res*=(m-i);
            res/=(i+1);
        }
        return res;
    }
    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);

        int len = in.nextInt();
        int total_ways=0;

        int arr[] = new int[len];
        int count[] = new int[len+1];

        for(int i=0;i<len;i++)
        {
            arr[i]=in.nextInt();
            count[arr[i]]++;
        }

        for(int i=0;i<len;i++)
        {
            count[arr[i]]--;

            total_ways=0;
            for(int j=0;j<len;j++)
            {
                if(count[j]>1)
                    total_ways+=comb(count[j],2);
            }

            System.out.println(total_ways);

            count[arr[i]]++;
        }
            
    }
}