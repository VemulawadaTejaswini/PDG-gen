import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        if(a<=0 && 0<=b){ System.out.println("Zero"); }
        else if(0<=a && 0<=b){ System.out.println("Positive"); }
        else { System.out.println((Math.abs(b)-Math.abs(a)+1)%2==0 ? "Positive":"Negative"); }
    }
}