import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[m];
        int[] d = new int[m-1];
        long sum = 0;
        for(int i = 0; i < m; i++){
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        for(int i = 0; i < m-1; i++){
            d[i] = x[i+1] - x[i];
        }
        Arrays.sort(d);
        for(int i = 0; i < m - n; i++){
            sum += d[i];
        }
        System.out.println(sum);
    }
}