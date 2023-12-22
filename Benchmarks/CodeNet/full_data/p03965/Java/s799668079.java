import java.io.*;
import java.util.*;

public class Main {
    
    static final int INF=-1000000000;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        int times=0;
        int score=0;
        for(int i=0;i<str.length();i++){
            if(times>0 && str.charAt(i)=='g'){
                score++;
                times--;
            }else{
                if(str.charAt(i)=='p'){ score--; }
                times++;
            }
        }System.out.println(score);
    }
}
