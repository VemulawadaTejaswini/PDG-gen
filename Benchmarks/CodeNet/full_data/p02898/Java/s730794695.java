import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        PrintWriter cout = new PrintWriter(System.out);

        int n = cin.nextInt(), k = cin.nextInt(), cnt = 0;;
        for(int i=0;i<n;i++) if(cin.nextInt() >= k) cnt++;
    
        cout.println(cnt);
        cout.close();
    }
}