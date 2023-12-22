import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int X = Integer.parseInt(s[1]);
        int sum = 0;
        int count = 1;
        s = stdR.readLine().split(" ");
        for(int i = 0 ; i < N ; i++) {
            sum += Integer.parseInt(s[i]);
            if(sum <= X) {
                count++;
            }else {
                break;
            }
        }
        System.out.println(count);
    }
}