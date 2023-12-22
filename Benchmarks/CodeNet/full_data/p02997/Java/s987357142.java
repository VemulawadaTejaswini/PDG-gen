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
        int n = sc.ni(), k = sc.ni();
        
        if(k > (n - 1) * (n - 2) / 2){
            out.println(-1);
            return;
        }
        
        outer:
        for(int i = 1; i < n; i++) for(int j = i + 1; j <= n; j++){
            if(k == 0) break outer;
            mprintln(i, j);
            --k;
        }
    }

    private static int getMaxPresent(LinkedList<Integer>[] deg, int k) {
        for(int i = k; i >= 0; i--) if(!deg[i].isEmpty()) return i;
        return -1;
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