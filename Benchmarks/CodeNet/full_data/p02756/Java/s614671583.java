import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        
        FastScanner sc = new FastScanner(System.in);
        
        StringBuilder sb = new StringBuilder(sc.next());
        int q = Integer.parseInt(sc.next());
        boolean reverse = false;
        for(int i = 0; i < q; i++){
            if(Integer.parseInt(sc.next()) == 1){
                reverse = !reverse;
            }else{
                int f = Integer.parseInt(sc.next());
                String c = sc.next();
                if((!reverse && f == 1) || (reverse && f == 2)){
                    sb.insert(0, c);
                }else{
                    sb.append(c);
                }
            }
        }
        if(reverse){
            System.out.println(sb.reverse());
        }else{
            System.out.println(sb);
        }
    }
    
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        
        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }
        String next(){
            while(st == null || !st.hasMoreTokens()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch(IOException  e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
    }
}