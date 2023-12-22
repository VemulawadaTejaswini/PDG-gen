import java.util.*;
import java.io.*;


public class Main{
    public static void main(String... string) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = reader.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<tmp.length; i++){
            list.add(Integer.parseInt(tmp[i]));
        }
        list.sort( (a, b) -> a - b);
        int result = list.get(0) + list.get(2) * 10 + list.get(1);
        System.out.println(result);
    }
}