import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken())/2*2;
        long b = Long.parseLong(st.nextToken())/2*2;
        if((a^b)==0){
            System.out.println("Alice");
        }else{
            System.out.println("Brown");
        }
        
    }
     
}

