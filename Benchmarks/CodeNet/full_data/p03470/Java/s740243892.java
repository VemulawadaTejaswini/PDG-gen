import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        Integer[] numbers = new Integer[n];
        Set<Integer> d = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            d.add(Integer.valueOf(br.readLine()));
        }
        
        out.println(d.size());
        out.close();
        
    }
}