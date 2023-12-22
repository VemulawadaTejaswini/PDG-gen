import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> lines = readLines();
        String line = lines.get(0);
        List<Integer> numbers = Arrays.asList(line.split(" "))
                .stream()
                .map((n) -> Integer.parseInt(n))
                .collect(Collectors.toList());

        System.out.println((numbers.get(0) < numbers.get(1)) ? "0" : "10");
    }

    public static List<String> readLines() throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in, "utf-8");
        BufferedReader br = new BufferedReader(reader);

        List<String> retList = new ArrayList<>();
        String line = br.readLine();
        while (line != null && !line.isEmpty()) {
            retList.add(line);
            line = br.readLine();
        }

        reader.close();
        br.close();
        return retList;
    }
}