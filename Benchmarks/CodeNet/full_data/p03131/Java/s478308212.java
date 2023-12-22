import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String[]s=bufferedReader.readLine().split( " ");
        long k=Long.parseLong(s[0]),a=Long.parseLong(s[1]),b=Long.parseLong(s[2]);
        List<Long>list=new ArrayList<>();
        list.add(k+1);
        k-=((a-1)+2);
        long ans = 0;
        if(k==0)
            ans=b;
        if(k>0 && b>a) {
            ans = b;
            while (k > 1) {
                ans -= a;
                ans += b;
                k-=2;
            }
        }
        if(k==1)
            ans++;
        list.add(ans);
        System.out.println(Collections.max(list));
    }
}