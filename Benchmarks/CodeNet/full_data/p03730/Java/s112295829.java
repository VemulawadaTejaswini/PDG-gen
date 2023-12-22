import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(b>c&&c%Euclid(a,b)==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
        private static int Euclid(int n, int m) {
        int tmp;
        while (true) {
            if (n == 0) {
                return m;
            } else if (m == 0) {
                return n;
            }
            tmp = n;
            n = m;
            m = tmp;
            n = n % m;

        }

    }
}