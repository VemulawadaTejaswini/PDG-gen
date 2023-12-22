import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int [] values = new int[5];
        for (int i = 0; i < 5; i++) {
            values[i] = Integer.parseInt(input.readLine());
        }
        int k = Integer.parseInt(input.readLine());

        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j < 5; j++) {
                if (Math.abs(values[i] - values[j]) > k){
                    System.out.println(":(");
                    return;
                }
            }
        }
        System.out.println("Yay!");
    }
}
