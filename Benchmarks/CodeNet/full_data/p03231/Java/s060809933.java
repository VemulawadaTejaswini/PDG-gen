import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        sc.close();
        long lcm = lcm(n, m);
        char[] array = new char[(int) lcm];
        Arrays.fill(array, '#');

        for(int i = 0; i < n; i++){
            array[(int) (i * (lcm / n))] = s[i];
        }

        boolean success = true;
        for(int j = 0; j < m; j++){
            int idx = (int) (j * (lcm / m));
            if(array[idx] == '#'){
                array[idx] = t[j];
                continue;
            }
            if(array[idx] != t[j]){
                success = false;
                break;
            }
        }

        if(success){
            System.out.println(lcm);
        }else{
            System.out.println(-1);
        }
    }

    private static long gcd(long n, long m){
        if(n < m) return gcd(m, n);
        if(m == 0) return n;
        return gcd(m, n % m);
    }
    private static long lcm(long n, long m){
        return n * m / gcd(n, m);
    }
}
