
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int res = factorial(n);
        String str = Integer.toString(res);
        StringBuilder rev = new StringBuilder(str);
        String s = rev.reverse().toString();
        String[] st = s.split("");
        int count = 0;
        for (int i=0; i<st.length; i++){
            if (st[i].contains("0")) {
                count += 1;
            } else {
                break;
            }
        }
        System.out.println(count);
    }

    public static int factorial(int a){
        return (a<2)?1:a*factorial(a-2);
    }
}
