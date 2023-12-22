import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] nx = br.readLine().split(" ");
        int n = Integer.parseInt(nx[0]);
        int x = Integer.parseInt(nx[1]);
        int min = 1300;
        
        for(int i = 0; i < n; i++){
            int temp = Integer.parseInt(br.readLine());
            min = min > temp ? temp : min;
            x -= temp;
        }
        
        System.out.println(n + x/min);
    }
}
