
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int H[] = new int[(int)N];
        long total = 0;
        for (int i=0;i<N;i++)
        {
            H[i]=scanner.nextInt();
        }
        mergeSort(H,0,N-1);

        for (long i = 0;i<N-K;i++)
        {
            total+=H[(int)i];
        }
        System.out.println(total);

    }
    static void mergeSort(int[] arr,int start,int end)
    {
        if(end>start)
        {
            int mid = (start+end)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    static void merge(int[] arr,int start,int middle,int end)
    {
        int n1= middle - start +1;
        int n2 = end - middle;
        int L[] = new int [n1];
        int R[] = new int [n2];

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[start + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[middle + 1+ j];

        int i=0,j=0;
        int k=start;
        while (i<n1 && j<n2)
        {
            if(L[i]<R[i])
            {
                arr[k]=L[i];
                i++;
            }
            else
            {
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }

    }
}