import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int upper = Integer.parseInt(br.readLine());
        int lower = Integer.parseInt(br.readLine());
        int height = Integer.parseInt(br.readLine());
        int area = (upper+lower)*height/2;
        System.out.println(area);
    }
}
