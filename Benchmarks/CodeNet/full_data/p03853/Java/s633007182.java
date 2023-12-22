import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());       
        int W = Integer.parseInt(st.nextToken());       

        String[] orig = new String[H];

        for(int i=0; i<H; i++){
            String cur = br.readLine();
            orig[i]=cur;
        }

        for(int i=0; i<H; i++){
            System.out.println(orig[i]);
            System.out.println(orig[i]);
        }



        
    }
}
