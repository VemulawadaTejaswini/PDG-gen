import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String[] input1 = br.readLine().split(" ");
        int h = Integer.parseInt(input1[0]);
        int n = Integer.parseInt(input1[1]);
        
        String[] input2 = br.readLine().split(" ");
        int[] numbers = new int[n];
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            numbers[i] = Integer.parseInt(input2[i]);
            sum += numbers[i];
        }
        
        out.println(sum >= h ? "Yes" : "No");
        out.close();
        
    }
}