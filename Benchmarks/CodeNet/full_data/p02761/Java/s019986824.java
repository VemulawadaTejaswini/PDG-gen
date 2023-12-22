import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");
        int n = Integer.parseInt(values[0]);
        int m = Integer.parseInt(values[1]);
        int f = 0,s = 0,t = 0;
        boolean fb = false ,sb = false,tb = false;
        String ret = "-1";
        boolean br = false;
        for (int i = 0; i < m; i++) {
            line = scanner.nextLine();
            values = line.split(" ");
            int a = Integer.parseInt(values[0]);
            int b = Integer.parseInt(values[1]);
            if (a == 1) {
                if (fb && f != b){
                    br = true;
                    break;
                }
                f = b;
                fb = true;
            } else if (a == 2) {
                if (sb && s != b) {
                    br = true;
                    break;
                }
                s = b;
                sb = true;
            } else if (a == 3) {
                if (tb && t != b) {
                    br = true;
                    break;
                }
                t = b;
                tb = true;
            }
        }
        if (String.valueOf((f * 100 + s * 10 + t)).length() != n) {
            ret = "-1";
        } else if (!br) {
            ret = String.valueOf((f * 100 + s * 10 + t));
        }
        System.out.println(ret);
    }
}
