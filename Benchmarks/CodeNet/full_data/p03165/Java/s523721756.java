import java.io.IOException;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    static String[][] dp;

    static String  max(String a, String b){
        if(a != null && b != null)
            if(a.length() >= b.length())
                return a;
            else
                return b;
        else{
            if( a == null )
                return b;
            else
                return a;
        }
    }

    static String max(String a, String b, String c){
        if(a != null && b != null && c != null){
            if(a.length() >= b.length() && a.length() >= c.length()){
                return a;
            }else if(b.length() >= a.length() && b.length() >= c.length()){
                return b;
            }else{
                return c;
            }
        }else{
            if( a== null)
            return max(b,c);
            if( b == null)
                return max(a,c);
            else
                return max(a,b);
        }
    }
    static String calculate(String s, String t, int i, int j){
        if(i < 0 || j < 0){
            return "";
        }else {
            if(dp[i][j] != null){
                return dp[i][j];
            }else if(s.charAt(i)==t.charAt(j)){
                dp[i][j] = calculate(s,t,i-1,j-1)+s.charAt(i);
                return dp[i][j];
            }
            else {
                dp[i][j] = max(calculate(s,t,i,j-1),calculate(s,t,i-1,j));
                return dp[i][j];
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Reader sc = new Reader();
        String s = sc.readLine();
        String t = sc.readLine();
        dp = new String[s.length()][t.length()];


        String ans = calculate(s,t,s.length()-1,t.length()-1);
        System.out.println(ans);
    }
}



/** Faster input **/
class Reader {
    final private int BUFFER_SIZE = 1 << 32;private DataInputStream din;private byte[] buffer;private int bufferPointer, bytesRead;
    public Reader(){din=new DataInputStream(System.in);buffer=new byte[BUFFER_SIZE];bufferPointer=bytesRead=0;}
    public Reader(String file_name)throws IOException{din=new DataInputStream(new FileInputStream(file_name));buffer=new byte[BUFFER_SIZE];bufferPointer=bytesRead=0;}
    public String readLine()throws IOException{byte[] buf=new byte[1024*16];int cnt=0,c;
        while((c=read())!=-1){if(c=='\n')break;buf[cnt++]=(byte)c;}return new String(buf,0,cnt);}
    public int nextInt()throws IOException{int ret=0;byte c=read();while(c<=' ')c=read();boolean neg=(c=='-');
        if(neg)c=read();do{ret=ret*10+c-'0';}while((c=read())>='0'&&c<='9');if(neg)return -ret;return ret;}
    public long nextLong()throws IOException{long ret=0;byte c=read();while(c<=' ')c=read();boolean neg=(c=='-');
        if(neg)c=read();do{ret=ret*10+c-'0';}while((c=read())>='0'&&c<='9');if(neg)return -ret;return ret;}
    public double nextDouble()throws IOException{double ret=0,div=1;byte c=read();while(c<=' ')c=read();boolean neg=(c=='-');if(neg)c = read();do {ret=ret*10+c-'0';}while((c=read())>='0'&&c<='9');
        if(c=='.')while((c=read())>='0'&&c<='9')ret+=(c-'0')/(div*=10);if(neg)return -ret;return ret;}
    private void fillBuffer()throws IOException{bytesRead=din.read(buffer,bufferPointer=0,BUFFER_SIZE);if(bytesRead==-1)buffer[0]=-1;}
    private byte read()throws IOException{if(bufferPointer==bytesRead)fillBuffer();return buffer[bufferPointer++];}
    public void close()throws IOException{if(din==null) return;din.close();}
}