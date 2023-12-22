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

        int mod[] = new int[n+1];
        int gap[] = new int[n+1];

        mod[0] = 0;
        gap[0] = 1;
        for(int i = 1 ;i <= n ; i++){
            mod[i] = (mod[i-1] * 10 + (s[i-1] - '0')) % p;
            gap[i] = gap[i-1] * 10 % p;
        }


        long res = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1; j <= n ; j++){
                int val = mod[j] - (mod[i] * gap[j-i]) % p;
                if(val == 0){
                    res++;
                }
            }
        }

        System.out.println(res);
    }
}
