import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        exec(args);
    }

    public static void exec(String[] args) {
        String str = readLineStandardInput();
        int K = Integer.parseInt(str);

        int cnt = 0;
        StringBuilder stringBuilder = new StringBuilder(10000);
        while(true){
            int digit = cnt / 9 + 1;
            int mem = cnt - 9 * (digit - 1) + 1;
            stringBuilder.append(mem);
            for(int i = 1; i < digit; i++){
                stringBuilder.append(9);
            }
            stringBuilder.append('\n');
            cnt++;
            if(cnt >= K){ break; }
        }

        System.out.println(stringBuilder);
    }

    private static String readLineStandardInput() {
        String str;
        try {
            str = input.readLine();
        } catch(IOException e){
            str = null;
            System.out.println(e);
        }
        return str;
    }
}
