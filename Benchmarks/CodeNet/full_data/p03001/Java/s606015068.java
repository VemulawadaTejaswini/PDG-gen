import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        int W = Integer.parseInt(s[0]);
        int H = Integer.parseInt(s[1]);
        int x = Integer.parseInt(s[2]);
        int y = Integer.parseInt(s[3]);
        int pre1 = Math.min(y * W, (H - y) * W);
        int pre2 = Math.min(x * H, (W - x) * H);
        if(pre1 == pre2) {
            System.out.println(pre1+" "+1);
        }else if(pre1 > pre2){
            System.out.println(pre1+" "+0);
        }else {
            System.out.println(pre2+" "+0);
        }
    }
}