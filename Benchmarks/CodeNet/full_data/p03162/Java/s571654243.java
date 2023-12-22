
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException{
        process();
    }
    public static void process() throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(in.readLine());
        StringTokenizer st=new StringTokenizer(in.readLine()," ");
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(st.nextToken());
        for(int i=1;i<n;i++){
            st=new StringTokenizer(in.readLine(), " ");
            int a1=Integer.parseInt(st.nextToken());
            int b1=Integer.parseInt(st.nextToken());
            int c1=Integer.parseInt(st.nextToken());
            int x=a1+Math.max(b,c);
            int y=b1+Math.max(a,c);
            int z=c1+Math.max(b,a);
            a=x; b=y; c=z;
        }
        System.out.println(Math.max(a,Math.max(b,c)));
    }
}
