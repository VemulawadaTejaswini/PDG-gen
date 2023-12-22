import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] tab = {0,0,0,0,0,0,0,0};
    static int m = 0;
     static void f(int val) {
        if (val <= 399 && val >= 1) tab[0]++;
        else if (val <= 799 && val >= 400) tab[1]++;
        else if (val <= 1199 && val >= 800) tab[2]++;
        else if (val <= 1599 && val >= 1200) tab[3]++;
        else if (val <= 1999 && val >= 1600) tab[4]++;
        else if (val <= 2399 && val >= 2000) tab[5]++;
        else if (val <= 2799 && val >= 2400) tab[6]++;
        else if (val <= 3199 && val >= 2800) tab[7]++;
        else m++;
    }
    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int n = fs.nextInt();
        for(int i=0,val; i<n; i++){
            val = fs.nextInt();
            f(val);
        }
        int ans = 0;
        for (int i = 0; i < 8; i++) {
            if (tab[i] != 0)
                ans++;
        }
        int rest = 8 - ans;
        if( m > rest)
            System.out.println(ans + " " + (ans + Math.ceil(m/rest)));
        else
            System.out.println(ans + " " + (ans + m));
    }


    static class FastReader{
        InputStreamReader inp ;
        BufferedReader bf ;
        StringTokenizer st;
        public FastReader(){
            inp = new InputStreamReader(System.in);
            bf = new BufferedReader(inp);
        }
        String next(){
            while(st==null || !st.hasMoreElements()){
                try{
                    st=new StringTokenizer(bf.readLine());
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt()  {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try{
                str=bf.readLine();
            }
            catch(IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
