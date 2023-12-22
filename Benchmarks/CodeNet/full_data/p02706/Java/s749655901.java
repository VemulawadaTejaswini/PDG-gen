import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), false);
        
        int m = in.nextInt();
        int n = in.nextInt();
        int ans=0;
        for(int i=0;i<n;i++) ans+=in.nextInt();
        out.println(m-ans);
        
        in.close();out.flush();out.close();
    }
}