import java.io.*;
import  java.util.*;
import static java.lang.System.in;

public class Main{
    static int n,m;
    static long[] head,pos;
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        //String[] buf = reader.readLine().split(" ");
        char b = sc.next().charAt(0);
        char ans;
        if(b=='A') ans = 'T';
        else if(b=='T') ans ='A';
        else if(b=='C') ans = 'G';
        else ans = 'C';
        System.out.println(ans);
    }
}
