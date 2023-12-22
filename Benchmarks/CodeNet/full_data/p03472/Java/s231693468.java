import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];

        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int ans = ( H + a[N-1] - 1) / a[N-1];

        int i = 0;
        for(int j = 0; j < N; j++){
            int tmp = 0;
            i++;
            H -= b[N - i];
            if(H <= 0){
                H = 0;
            }

            tmp = i + ( H + a[N-1] - 1) / a[N-1];

            ans = Math.min(ans, tmp);

            if(H < 0){
                break;
            }
        }

        System.out.println(ans);
    }
}