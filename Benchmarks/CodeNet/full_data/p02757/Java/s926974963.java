import java.util.Arrays;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] arg){
        Main m = new Main();
        m.run();
    }

    void run(){
        int n = sc.nextInt();
        int p = sc.nextInt();
        char[] s = sc.next().toCharArray();

        int mod[] = new int[n];
        long count[] = new long[p];

        mod[0] = (s[0] - '0') % p;
        count[mod[0]]++;
        for(int i = 1 ;i < n ; i++){
            mod[i] = (mod[i-1] * 10 + (s[i] - '0')) % p;
            count[mod[i]]++;
        }

        long res = count[0];
        for(int i = 0 ; i < p; i++){
            res += count[i] * (count[i]-1)/2;
        }
        System.out.println(res);
    }
}
