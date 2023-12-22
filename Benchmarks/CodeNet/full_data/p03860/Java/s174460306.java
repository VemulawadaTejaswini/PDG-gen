import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        // int N = Integer.parseInt(st.nextToken());
        
        String s = br.readLine();
        String[] sa = s.split(" ");
        System.out.println("A"+sa[1].charAt(0)+"C");

        
    }
}
