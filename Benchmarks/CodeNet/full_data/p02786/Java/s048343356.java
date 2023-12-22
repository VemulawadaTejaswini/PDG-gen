import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    
    static long attack_number(long h){
        if(h == 1L) return 1;
        return 2 * attack_number(h / 2L) + 1;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in1 = br.readLine().split(" ");
        long H = Long.parseLong(in1[0]);
        br.close();
        
        System.out.println(attack_number(H));
    }
}