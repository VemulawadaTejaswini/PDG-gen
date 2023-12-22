import java.io.*;
import java.util.*;


public class Main {
    static HashMap<Integer,Integer>[] g; //<toRoom, keyNecessary>
    static int n,m;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        //n = Integer.parseInt(buf[0]); m = Integer.parseInt(buf[1]);
        String s = sc.next();
        int cnt = 0;
        for(char w:s.toCharArray()){
            if(w=='x') cnt++;
        }
        String ans = cnt<8?"YES":"NO";
        PrintWriter out = new PrintWriter(System.out);
        out.println(ans);
        out.flush();
    }
}

