import java.io.*;
import java.util.*;

public class Main{
    static public void main(String[] args) throws Exception{
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ")
        Main main = new Main();
        main.solve();
    }
    void solve(){
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char c = s[0];
        char a = (char)(c+1);
        System.out.println(a);
    }
}

