import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] array_a = new int[n];
        int[] array_b = new int[n];
        int[] array_c = new int[n];

        for(int i = 0;i < n;i++){
            array_a[i] = sc.nextInt();
        }
        for(int i = 0;i < n;i++){
            array_b[i] = sc.nextInt();
        }
        for(int i = 0;i < n;i++){
            array_c[i] = sc.nextInt();
        }

        Arrays.sort(array_a);
        Arrays.sort(array_b);
        Arrays.sort(array_c);

        int ans = 0;

        int temp_a;
        int temp_c;

        for(int i = 0;i < n;i++){
             temp_a = Arrays.binarySearch(array_a,array_b[i]);
             temp_a = temp_a < 0 ? 0 - temp_a - 1:temp_a;

             temp_c = Arrays.binarySearch(array_c,array_b[i]);
             temp_c = temp_c < 0 ? n + temp_c + 1: n - temp_c + 1;

             ans += temp_a*temp_c;
        }

        System.out.println(ans);
    }
}
