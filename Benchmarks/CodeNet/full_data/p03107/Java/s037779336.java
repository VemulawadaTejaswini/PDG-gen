import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String str = stdR.readLine();
        int count = 0;
        int zero = 0;
        int one = 0;
        for(int i = 0 ; i < str.length() ; i++) {
            if(str.charAt(i) == '0')zero++;
            if(str.charAt(i) == '1')one++;
            int min = Math.min(zero, one);
            if(min > 0) {
                zero -= min;
                one -= min;
                count += min * 2;
            }
        }
        System.out.println(count);
    }
}
