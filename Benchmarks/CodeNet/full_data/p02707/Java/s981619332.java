import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(br.readLine()) - 1;
        String[] inputs = br.readLine().split(" ");
        int[] nums = new int[num];
        for(int i = 0; i < num; i++) {
            nums[i] = Integer.parseInt(inputs[i]);
        }

        Map<Integer,List<Integer>> map = Arrays.stream(nums).mapToObj(s -> s).collect(Collectors.groupingBy(s -> s));
        for(int i = 1; i <= num; i++) {

            pw.println(map.containsKey(i) ? map.get(i).size() : 0);
        }

        pw.flush();
    }
}