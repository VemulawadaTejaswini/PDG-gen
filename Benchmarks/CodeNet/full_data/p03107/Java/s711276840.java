import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder(stdR.readLine());
        char def = 'N';
        int count = 0;
        for(int i = 0 ; i < str.length() ; i++) {
            if(def != 'N' && def != str.charAt(i)) {
                str.delete(i - 1, i + 1);
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
