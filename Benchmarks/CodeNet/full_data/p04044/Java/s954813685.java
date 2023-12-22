import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] num = line.split(" ");
        int n = Integer.parseInt(num[0]);
        int l = Integer.parseInt(num[1]);
        List<String> str = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            str.add(br.readLine());
        }
        Collections.sort(str);
        for(int i=0; i<n;i++){
            System.out.print(str.get(i));   
        }
    }    
}
