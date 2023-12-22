import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long s = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        long ans=0;
        if(c<=2*s){
            ans+=c/2;
        }
        else{
            ans+=s;
            c-=2*s;
            ans+=c/4;
        }
        System.out.println(ans);

    }


}
