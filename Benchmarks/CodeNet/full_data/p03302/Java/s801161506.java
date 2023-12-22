import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] str = stdR.readLine().split(" ");
        int H1 = Integer.parseInt(str[0]);
        int H2 = Integer.parseInt(str[1]);
        if(H1 + H2 == 15) {
            System.out.println("+");
        }else if(H1 * H2 == 15) {
            System.out.println("*");
        }else {
            System.out.println("x");
        }
    }
}
