import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class Main {
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String line;
    static  long n,k,T,N,m,A,B,P;
    static StringTokenizer st;
    static Scanner in = new Scanner(System.in);
    static char [] word ;
    public static void main(String[] args) throws IOException {
      //D - String Formation Data structure
      st = new StringTokenizer(br.readLine());
      N  = Integer.parseInt(st.nextToken());
word  = new char[(int) N];
      P = Integer.parseInt(st.nextToken());
      line=br.readLine();
      word = line.toCharArray();
      for (int i=0;i<=word.length;i++){
          BigInteger sum;
          for (int j=i+1;j<=word.length;j++){
             // System.out.println(line.substring(i,j));
              sum = new BigInteger(line.substring(i,j));
              if (sum.mod(new BigInteger(String.valueOf(P))).equals(new BigInteger("0")))
                  k++;
          }

      }
        pw.print(k);
      pw.flush();
    }
}