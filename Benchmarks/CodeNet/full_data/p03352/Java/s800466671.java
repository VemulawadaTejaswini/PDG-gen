import java.util.Scanner;

public class Main {


    private static int pow(int base,int os) {
        if(os == 0)
            return 1;
        int temp = pow(base, os/2);
        if (os % 2 == 0)
            return temp * temp;
        else
            return (base * temp * temp);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int ans = 0;
        for(int i=1;i<=x;++i) {
            for (int j = 2; j <= x; ++j) {
                int num = pow(i, j);
                if (num > x)
                    break;
                ans = Math.max(ans, pow(i, j));
            }
        }
        System.out.println(x==1?1:ans);

    }
}
