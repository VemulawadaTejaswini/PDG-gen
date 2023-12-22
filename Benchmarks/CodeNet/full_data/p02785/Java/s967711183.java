
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long K = scanner.nextLong();
        long H[] = new long[(int)N];
        long total = 0;
        for (int i=0;i<N;i++)
        {
            H[i]=scanner.nextLong();
        }
        for(int i=0;i<N;i++)
        {
            for (int j=i;j<N-1;j++)
            {
                if(H[j]<H[j+1])
                {
                    swap(H,j,j+1);
                }
            }
        }
        for (long i = K;i<N;i++)
        {
            total+=H[(int)i];
        }
        System.out.println(total);
    }
    private static void swap(long[] arr,int i,int j)
    {
        long temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}