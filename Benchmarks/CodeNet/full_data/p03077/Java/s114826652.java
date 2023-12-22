import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long n = Long.parseLong(br.readLine());
        Long[] a = new Long[5];
        int min = 0;
        for(int i = 0; i < 5; i++) {
            a[i] = Long.parseLong(br.readLine());
            if(a[min] >= a[i]) {
                min = i;
            }
        }

        System.out.println(4 + (long) Math.ceil(1.0 * n / a[min]));
    }
}