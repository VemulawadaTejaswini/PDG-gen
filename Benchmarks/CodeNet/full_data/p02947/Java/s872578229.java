import java.io.*;
import java.util.*;
import java.util.function.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in=new StringTokenizer("");
        int n=Integer.parseInt(br.readLine());
        Map<String,Long> mp=new HashMap<>();
        Consumer<String> fun=(s)->mp.put(s, mp.getOrDefault(s, 0L)+ 1L);
        for(int i=0;i<n;i++)fun.accept(Arrays.toString(br.readLine().chars().mapToObj(it -> (char) it).sorted().toArray()));
        System.out.println(mp.values().stream().mapToLong(it -> it * (it - 1) / 2).sum());
    }
}