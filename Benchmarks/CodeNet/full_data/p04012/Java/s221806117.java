import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        execute();
    }

    private static void execute() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(checkBeautifulString(br.readLine()));
    }

    private static String checkBeautifulString(String string) {
        List<String> list = new ArrayList<>();
        for(char ch : string.toCharArray()) {
            String s = String.valueOf(ch);
            if (list.remove(s)) {
                continue;
            }
            list.add(s);
        }
        return list.isEmpty() ? "Yes" : "No";
    }
}