import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String str1 = br.readLine();
        String str2 = br.readLine();
        int count = 0;

        for (int i = 0; i < length; i++) {
            String tmp1 = str1.substring(i, length);
            String tmp2 = str2.substring(0, length - i);
            if(tmp1.equals(tmp2)) {
                count = i;
                break;
            }
            count = ++i;
        }

        System.out.println(count + length);

    }
}
