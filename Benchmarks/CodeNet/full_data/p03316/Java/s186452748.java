import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        String str = readLineStandardInput();
        int N = Integer.parseInt(str);
        char[] S = str.toCharArray();
        int digitSum = 0;
        for(char s: S){
            int d = Character.getNumericValue(s);
            digitSum += d;
        }
        int mem = N / digitSum;
        if(N == mem * digitSum){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
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