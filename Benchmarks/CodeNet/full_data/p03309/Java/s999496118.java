
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        exec(args);
    }

    public static void exec(String[] args) {
        String str = readLineStandardInput();
        int N = Integer.parseInt(str);
        str = readLineStandardInput();
        String[] Astr = str.split(" ");
        int[] Ami = new int[N];
        for(int i = 0; i < Ami.length; i++){
            int tmp = Integer.parseInt(Astr[i]);
            Ami[i] = tmp - (i + 1);
        }
        Arrays.sort(Ami);
        int median = Ami[N / 2];
        int sum = 0;
        for(int i = 0; i < Ami.length; i++) {
            if(Ami[i] < median) {
                sum += median - Ami[i];
            }
            else {
                sum += Ami[i] - median;
            }
        }
        System.out.println(sum);
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
