import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String str = stdR.readLine();
        boolean[] br = new boolean[str.length()];
        char def = 'N';
        int count = 0;
        for(int i = 0 ; i < str.length() ; i++) {
            if(br[i])continue;
            if(def != 'N' && def != str.charAt(i)) {
                br[i - 1] = true;
                br[i] = true;
                count += 2;
                i = -1;
                def = 'N';
            }else {
                def = str.charAt(i);
            }
        }
        System.out.println(count);
    }
}