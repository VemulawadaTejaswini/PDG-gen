import java.io.*;
import java.io.InputStreamReader;
import java.util.*;
public class Main
{
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        HashSet<Integer>set = new HashSet<>();
        for(int i = 1;i <= n;i++) {
            int a = Integer.parseInt(st.nextToken());
            if(!set.contains(a))set.add(a);
            else set.remove(a);
        }
        System.out.println(set.size());
        
    }

}