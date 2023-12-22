import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        execute();
    }

    private static void execute() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lineLength = br.readLine().split(" ")[0];
        List<String> strs = new ArrayList<>();
        for (int i=0; i < Integer.parseInt(lineLength); i++) {
            strs.add(br.readLine());
        }
        System.out.println(minLexicalOrder(strs));
    }

    private static String minLexicalOrder(List<String> strs) {
        return strs.stream().sorted().collect(Collectors.joining());
    }
}