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
        boolean isBi = N / 2 * 2 == N;
        int medianBigIdx = N / 2;
        int medianBig = Ami[medianBigIdx];
        int medianSmallIdx = !isBi ? N / 2 : N / 2 - 1;
        int medianSmall = Ami[medianSmallIdx];
        long sumBig = 0, sumSmall = 0;
        for(int i = 0; i < Ami.length; i++) {
            if(Ami[i] < medianBig) {
                sumBig += medianBig - Ami[i];
            }
            else {
                sumBig += Ami[i] - medianBig;
            }

            if(Ami[i] < medianSmall) {
                sumSmall += medianSmall - Ami[i];
            }
            else {
                sumSmall += Ami[i] - medianSmall;
            }
        }
        long res = sumBig < sumSmall ? sumBig : sumSmall;
        System.out.println(res);
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
