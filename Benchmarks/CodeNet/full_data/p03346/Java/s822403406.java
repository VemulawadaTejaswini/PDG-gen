import java util.scanner;
class Main {
public static void main(String[] args)
    {
        int N = sc.nextInt();
        int A = sc.nextIntArray(N);
        int[] rev =  new int[N+1];
        for (int i = 0; i < N; i++)
        {
            rev[A[i] ] = i;
        }
        int maxLen = 1;
        int len = 1;
        for (int i = 1; i < N; i++)
        {
            if(rev[i] < rev[i+1]){
                len++;
            }else{
                maxLen = Math.max(maxLen,  len);
                len = 1;
            }
        }
        maxLen = Math.max(maxLen,  len);
        int res = N - maxLen;
        System.out.println(res);
    }
}
