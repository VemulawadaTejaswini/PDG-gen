import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] s=reader.readLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        String[] s1=reader.readLine().split(" ");
        int[] days=new int[m];
        int count=0;
        for (int i = 0; i <m ; i++) {
            days[i]=Integer.parseInt(s1[i]);
            count+=days[i];
        }
        if (count<=n)
            System.out.println(n-count);
        else if (count>n)
            System.out.println(-1);

    }

}