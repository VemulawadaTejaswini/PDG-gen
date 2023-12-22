import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main  {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(input.readLine());
        int a = Integer.parseInt(tokenizer.nextToken());
        int b = Integer.parseInt(tokenizer.nextToken());

        List<List<Integer>> lists = Arrays.asList(Arrays.asList(1,3,5,7,8,10,12), Arrays.asList(4,6,9,11), Arrays.asList(2));

        for (int i = 0; i < 3; i++) {
            if (lists.get(i).contains(a) && lists.get(i).contains(b)){
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }

}
