import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int happiness = 0;
        while (n >= 500) {
            happiness+=1000;
            n-=500;
        }
        while (n >= 5) {
            happiness+=5;
            n-=5;
        }
        System.out.println(happiness);
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write("\n");
//        bw.close();
    }

}