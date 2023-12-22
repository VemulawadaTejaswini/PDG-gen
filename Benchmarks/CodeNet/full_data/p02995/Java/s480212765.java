import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.regex.*;

public class Main {
    
    private static PrintWriter out;
    
    private static <T> void mprintln(T ... ar){
        for(T i: ar) out.print(i + " ");
        out.println();
    }
    
    public static void main(String[] args) throws FileNotFoundException{

        // Input from file
        // File inputFile = new File("JavaFile.txt");
        // File outputFile = new File("JavaOutputFile.txt");
        // FileReader fileReader = new FileReader(inputFile);
        // Here it ends

        MyScanner sc = new MyScanner();
        // MyScanner sc = new MyScanner(fileReader);

        out = new PrintWriter(new BufferedOutputStream(System.out)); // Output to console
        // out = new PrintWriter(new PrintStream(outputFile)); // Output to file

        getAns(sc);

        out.close(); 
    }
    
//  Global Variables  
    
    private static void getAns(MyScanner sc){
        long a = sc.nl(), b = sc.nl(), c = sc.nl(), d = sc.nl();
        long AC = a + (c - a % c) % c, LC = b - b % c;
        long AD = a + (d - a % d) % d, LD = b - b % d;
        long cd = lcm(c, d);
        long ACD = a + (cd - a % cd) % cd, LCD = b - b % cd;
        long NC = (LC - AC) / c + 1, ND = (LD - AD) / d + 1, NCD = (LCD - ACD) / cd + 1;
        long minus = NC + ND - NCD;
        long total = b - a + 1;
        out.println(total - minus);
    }
    
    private static long lcm(long a, long b){
        return a * b / gcd(a, b);
    }
    
    private static long gcd(long a, long b){
        return a == 0? b: gcd(b % a, a);
    }
    
    static class MyScanner{
        BufferedReader br;
	StringTokenizer st;

	MyScanner(FileReader fileReader){
            br = new BufferedReader(fileReader);
	}

	MyScanner(){
            br = new BufferedReader(new InputStreamReader(System.in));
	}

	String nn(){
            while(st == null || !st.hasMoreElements()){
		try{
                    st = new StringTokenizer(br.readLine());
		}catch(IOException e){
                    e.printStackTrace();
		}
            }
            return st.nextToken();
	}
        
        String nextLine(){
            String ans = "";
            try {
                ans = br.readLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            return ans;
        }

	char nc(){
            return nn().charAt(0);
	}

	int ni(){
            return Integer.parseInt(nn());
	}

	long nl(){
            return Long.parseLong(nn());
	}

	double nd(){
            return Double.parseDouble(nn());
	}

	int[] niArr0(int n){
            int[] ar = new int[n];
            for(int i = 0; i < n; i++) ar[i] = ni();
            return ar;
	}

        int[] niArr1(int n){
            int[] ar = new int[n + 1];
            for(int i = 1; i <= n; i++) ar[i] = ni();
            return ar;
	}

        long[] nlArr0(int n){
            long[] ar = new long[n];
            for(int i = 0; i < n; i++) ar[i] = nl();
            return ar;
        }

        long[] nlArr1(int n){
            long[] ar = new long[n + 1];
            for(int i = 1; i <= n; i++) ar[i] = nl();
            return ar;
        }
    }
}