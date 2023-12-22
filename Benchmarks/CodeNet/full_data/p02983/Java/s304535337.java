
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int L = stdIn.nextInt(); int R = stdIn.nextInt();
        int answer = 2018;
        if( R - L + 1 >= 2019) answer = 0;
        else{
            int[] a = new int[R - L + 1];
            for(int i = L ; i <= R ; i++)
                a[i - L] = i;
            Arrays.sort(a);
            answer = a[0] * a[1] % 2019;
        }
        System.out.println(answer);
    }
}