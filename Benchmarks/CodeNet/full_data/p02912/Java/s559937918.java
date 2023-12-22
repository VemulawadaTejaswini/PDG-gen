import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
        Long[] a = new Long[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }

        Arrays.sort(a, Collections.reverseOrder());

        long tmp;
        for(int i = 0; i < m; i++){
            a[0] = a[0] / 2;
            if(n > 1 && a[0] < a[1]) Arrays.sort(a, Collections.reverseOrder());
        }

        long sum = 0;
        for(int i = 0; i < n; i++){
            System.out.println(i + ": " + a[i]);
            sum += a[i];
        }

        System.out.println(sum);

    }

}
