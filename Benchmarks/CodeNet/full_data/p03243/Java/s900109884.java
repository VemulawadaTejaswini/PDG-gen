import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = scanner.nextInt(); //次に開催されるabcの回数
        int hoge;

        while(!isRepDigit(a)){
            a++;
        }
        hoge =a;

        out.println(hoge);
        out.flush();
    }

    private static boolean isRepDigit(int num){
        String str = String.valueOf(num);
        int len = str.length();
        boolean ret = true;
        for(int n = 0; n < len-1; n++) {
            if(str.charAt(n)!=str.charAt(n+1)){
                ret =false;
            }
        }
        return ret;
    }

}
