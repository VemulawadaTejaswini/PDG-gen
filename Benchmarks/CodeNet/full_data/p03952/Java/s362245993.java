import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        if(n != x){
            System.out.print("No");
            return;
        }
        System.out.println("Yes");
        StringBuilder sb = new StringBuilder();
        for(int i = 1;i < 2*n;i++){
            sb.append(i + " ");
            sb.append('\n');
        }
        System.out.print(sb);
    }
}