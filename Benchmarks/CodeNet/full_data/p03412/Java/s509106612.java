import java.util.Scanner;
import java.util.Arrays;


//ソート済み配列を渡すこと
class BinarySearch{
    int[] array;
    BinarySearch(int[] array){
        this.array=array;
    }
    int lower_bound(int key){
        int lower=-1;int upper=array.length;
        while(upper - lower>1){
            int center =(upper+lower)/2;
            if(array[center]>=key)upper=center;
            else lower=center;
        }
        return upper;
    }
    int upper_bound(int key){
        int lower=-1;int upper=array.length;
        while(upper-lower >1){
            int center=(upper+lower)/2;
            if(array[center]>key)upper=center;
            else lower=center;
        }
        return upper;
    }
}

class Main{



    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        for(int i=0;i<N;++i)a[i]=Integer.parseInt(scan.next());
        for(int i=0;i<N;++i)b[i]=Integer.parseInt(scan.next());

        int ans = 0;
        int[] B = new int[N];
        int[] A = new int[N];
        //各bitに対し
        BinarySearch bs = new BinarySearch(b);
        for(int i=0;i<29;++i){
            for(int j=0;j<N;++j)B[j]=b[j]%(1<<(i+1));
            for(int j=0;j<N;++j)A[j]=a[j]%(1<<(i+1));
            Arrays.sort(B);
            bs.array = B;
            boolean isOdd=false;
            for(int j=0;j<N;++j){
                isOdd ^= (bs.lower_bound((1<<i)*2 - A[j]) - bs.lower_bound((1<<i) - A[j]))%2==1;
                isOdd ^= (bs.lower_bound((1<<i)*4 - A[j]) - bs.lower_bound((1<<i)*3 - A[j]))%2==1;
            }
            if(isOdd)ans+=(1<<i);
        }

        System.out.println(ans);

    }
}