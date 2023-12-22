import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long x = Long.parseLong(st.nextToken());

        long ans = ((b-a)/x)-1;
        if (a%x!=0 && b%x!=0) {
            ans++;
        }
        else if(a%x==0 || b%x==0){
            ans+=2;
        }
        

        System.out.println(Math.max(0,ans));

        
    }
}
