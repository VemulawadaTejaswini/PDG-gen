import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
        int i;
        int j;

        long arr[] = new long [3*N];

        for (i=0; i<3*N; i++){
            arr[i]=sc.nextInt();
        }

        long beforemax[] = new long [N];
        long aftermax[] = new long [N];

        beforemax=Arrays.copyOfRange(arr, 0, N);

        Arrays.sort(beforemax);

        long beforesum[] = new long[N+1];


        aftermax=Arrays.copyOfRange(arr, 2*N, 3*N);

        Arrays.sort(aftermax);

        long aftersum[] = new long[N+1];

        beforesum[0]=longsum(beforemax);
        aftersum[N]=longsum(aftermax);


        for(i=N; i<2*N; i++){
            if(arr[i]>beforemax[0]){
                beforemax[0]=arr[i];
            }
            beforesum[i-N+1]=longsum(beforemax);
        }

        for(i=2*N-1; i>N-1; i--){
            if(arr[i]<aftermax[N-1]){
                aftermax[N-1]=arr[i];
            }
            aftersum[i-N]=longsum(aftermax);
        }

        long submax = -1000000;

        for(i=0; i<N+1; i++){
            if(beforesum[i]-aftersum[i]>submax){
                submax=beforesum[i]-aftersum[i];
            }
        }



		// 文字列の入力
		//String s = sc.next();
		// 出力
		System.out.println(submax);
	}


    public static int intsum(int[] x){
        int t = 0;
        for (int a:x){
            t += a;
        }
        return t;
    }
    public static long longsum(long[] x){
        long t = 0;
        for (long a:x){
            t += a;
        }
        return t;
    }
}

