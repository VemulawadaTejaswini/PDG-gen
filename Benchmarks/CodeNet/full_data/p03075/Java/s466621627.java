import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[5];
        for(int i = 0; i < 5; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        boolean flag = false;
        for(int i = 0; i < 4; i++) {
            for(int j = i + 1; j < 5; j++) {
                if(a[j] - a[i] > k) {
                    flag = true;
                    break;
                }
            }
        }

        System.out.println(flag? ":(" : "Yay!");
    }
}