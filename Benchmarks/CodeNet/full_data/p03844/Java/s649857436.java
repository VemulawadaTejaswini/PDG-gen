import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String [] formula = input.readLine().split("\\s+");
        int x = Integer.parseInt(formula[0]);
        int y = Integer.parseInt(formula[2]);
        System.out.println(formula[1].equals("+")?(x + y):(x - y));

    }
}
