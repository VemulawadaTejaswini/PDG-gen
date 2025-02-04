import java.util.*;
import java.io.*; 
import java.text.*;
//Solution Credits: Taranpreet Singh
public class Main{
    //SOLUTION BEGIN
    void solve(int TC) throws Exception{
        int x1 = ni(),  y1 = ni(),x2 = ni(), y2 = ni();
        int s = Math.max(x2-x1, y2-y1);
        if(x1==x2){
            if(y1<y2)pn((x1-s)+" "+y2+" "+(x1-s)+" "+ y1);
            else pn((x1+s)+" " + y2+" " + (x1+s)+" " + y1);
        }else if(y1==y2){
            if(x1<x2)pn(x2+" "+ (y2-s)+" " + x1+" " + (y2-s));
            else pn(x2+" " + (y2-s)+" " + x1+" " + (y2-s));
        }else{
            int dx = x2-x1, dy = y2-y1;
            int x3 = x2-dy, y3 = y2+dx;
            int x4 = (x3-dx), y4 = y3-dy;
            pn(x3+" " + y3+" " + x4+" " + y4);
        }
    }
    //SOLUTION ENDS
    long mod = (int)1e9+7, IINF = (long)1e18;
    final int MAX = (int)1e5+1, INF = (int)1e9, root = 3;
    DecimalFormat df = new DecimalFormat("0.00000000");
    double PI = 3.141592653589793238462643383279502884197169399375105820974944, eps = 1e-8;
    static boolean multipleTC = false, memory = true;
    FastReader in;PrintWriter out;
    void run() throws Exception{
        in = new FastReader();
        out = new PrintWriter(System.out);
        int T = (multipleTC)?ni():1;
        //Solution Credits: Taranpreet Singh
        for(int i = 1; i<= T; i++)solve(i);
        out.flush();
        out.close();
    }
    public static void main(String[] args) throws Exception{
        if(memory)new Thread(null, new Runnable() {public void run(){try{new Main().run();}catch(Exception e){e.printStackTrace();}}}, "1", 1 << 28).start();
        else new Main().run();
    }
    long gcd(long a, long b){return (b==0)?a:gcd(b,a%b);}
    int gcd(int a, int b){return (b==0)?a:gcd(b,a%b);}
    int bit(long n){return (n==0)?0:(1+bit(n&(n-1)));}
    void p(Object o){out.print(o);}
    void pn(Object o){out.println(o);}
    void pni(Object o){out.println(o);out.flush();}
    String n(){return in.next();}
    String nln(){return in.nextLine();}
    int ni(){return Integer.parseInt(in.next());}
    long nl(){return Long.parseLong(in.next());}
    double nd(){return Double.parseDouble(in.next());}

    class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws Exception{
            br = new BufferedReader(new FileReader(s));
        }

        String next(){
            while (st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (IOException  e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine(){
            String str = "";
            try{    
                str = br.readLine();
            }catch (IOException e){
                e.printStackTrace();
            }   
            return str;
        }
    }
}