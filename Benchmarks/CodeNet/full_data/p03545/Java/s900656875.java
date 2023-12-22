import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);
    Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        char[] arr = sc.next().toCharArray();

        StringBuffer sb = new StringBuffer();

//        System.out.println(arr[0]-'0');

        long ans = 0;

        int[] str = new int[3];

        outer:
        for (int i=0; i<2; i++) {
            ans = 0;
            for (int j=0; j<2; j++) {
                for (int k=0; k<2; k++) {
                    int a1 = arr[0] - '0';
                    int a2 = arr[1] - '0';
                    int a3 = arr[2] - '0';
                    int a4 = arr[3] - '0';
                    if (i==0) ans = a1 + a2;
                    else ans = a1 - a2;
                    if (j==0) ans += a3;
                    else ans -= a3;
                    if (k==0) ans += a4;
                    else ans -= a4;
                    if (ans == 7) {
                        str[0] = i;
                        str[1] = j;
                        str[2] = k;
                        break outer;
                    }
                }
            }
        }

//        System.out.println(str[0]);

        sb.append((arr[0]-'0'));
        sb.append( (str[0]==0) ? "+" : "-" );
        sb.append((arr[1]-'0'));
        sb.append( (str[1]==0) ? "+" : "-" );
        sb.append((arr[2]-'0'));
        sb.append( (str[2]==0) ? "+" : "-" );
        sb.append((arr[3]-'0'));
        sb.append("=");
        sb.append("7");

        System.out.println(sb.toString());

    }

}
