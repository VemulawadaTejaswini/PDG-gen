import java.util*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String S = br.readLine();
        br.close();

        int N = S.length();

        boolean[] direction = new boolean[4];
        Map<Character, Integer> chr_code = new HashMap<>();

        chr_code.put('N', 0);
        chr_code.put('S', 1);
        chr_code.put('E', 2);
        chr_code.put('W', 3);

        for(int i = 0; i < N; i++){
            char now_chr = S.charAt(i);
            direction[chr_code.get(now_chr)] = true;
        }

        if(
            !(direction[0] ^ direction[1]) &&
            !(direction[2] ^ direction[3])
        ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}