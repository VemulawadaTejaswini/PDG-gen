import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> in;
        in = new ArrayList<>();
        int count = Integer.parseInt(reader.readLine());
        for (int i = 0; i < count; i++) {
            String number = reader.readLine();
            if (in.contains(number)) {
                in.remove(number);
            } else {
                in.add(number);
            }
        }
        System.out.println(in.size());
    }
}