import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> lines = readLines();
        List<Integer> Ls = Arrays.stream(lines.get(0).split(" "))
                .map((l) -> Integer.parseInt(l))
                .collect(Collectors.toList());

        int W = Ls.get(0);
        int H = Ls.get(1);
        int x = Ls.get(2);
        int y = Ls.get(3);

        System.out.println(String.format("%f %d", W*H/2.0, (2*x == W && 2*y == H) ? 1 : 0));
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