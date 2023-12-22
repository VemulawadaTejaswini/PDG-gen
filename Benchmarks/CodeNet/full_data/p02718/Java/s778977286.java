import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = 1;
        int n = in.nextInt();
        int m = in.nextInt();
        int a[] = new int[n];
        int x = 1/(4*m),cnt=0;
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
            if(a[i]>=x) cnt++;
        }
        System.out.println(cnt>=m?"Yes":"No");
    }
}