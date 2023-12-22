import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str_as = br.readLine().split(" ");
        int[] as = new int[3];
        as[0] = Integer.parseInt(str_as[0]);
        as[1] = Integer.parseInt(str_as[1]);
        as[2] = Integer.parseInt(str_as[2]);
        Arrays.sort(as);
        int ans = 0;
        
        
        System.out.println(Math.abs(as[1]-as[0]) + Math.abs(as[2]-as[1]));
    }
}
