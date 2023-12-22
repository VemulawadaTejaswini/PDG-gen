import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    InputStream is;
    PrintWriter out;
    
    void solve(){
        //Enter code here
        int n = ni() , m = ni();
        while (m-- > 0) {
            n += 1;
            if (n == 24) n = 0;
        }
        out.println(n);
    }
    public static void main(String[] args) {
        Main play = new Main();
        play.run();
    }
    public void run(){
        is = System.in;
        out = new PrintWriter(System.out);
        solve();
        out.flush();
    }
    
    byte input[] = new byte[1024];
    int len = 0,ptr = 0;
    int readByte() {
        if(ptr >= len){
            ptr = 0;
            try{
                len = is.read(input);
            } catch(IOException e){
                throw new InputMismatchException();
            }
            if(len <= 0){
                return -1;
            }
        }
        return input[ptr++];
    }
    boolean isSpaceChar(int c) {
        return !( c >= 33 && c <= 126 );
    }
    int skip(){
        int b = readByte();
        while(b != -1 && isSpaceChar(b)){
            b = readByte();
        }
        return b;
    }
    
    char nc() {
        return (char)skip();
    }
    String ns() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while(!isSpaceChar(b)){
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    int ni() {
        int n = 0,b = readByte();
        boolean minus = false;
        while(b != -1 && !( (b >= '0' && b <= '9') || b == '-')){
            b = readByte();
        }
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        while(b >= '0' && b <= '9'){
            n = n * 10 + (b - '0');
            b = readByte();
        }
        return minus ? -n : n;
    }
    long nl() {
        long n = 0L;
        int b = readByte();
        boolean minus = false;
        while(b != -1 && !( (b >= '0' && b <= '9') || b == '-')){
            b = readByte();
        }
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        while(b>='0' && b<='9'){
            n = n * 10 + (b - '0');
            b = readByte();
        }
        return minus ? -n : n;
    }
    double nd() {
        return Double.parseDouble(ns());
    }
    float nf() {
        return Float.parseFloat(ns());
    }
    int[] na(int n){
        int a[] = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = ni();
        }
        return a;
    }
    char[] ns(int n) {
        char c[] = new char[n];
        int i , b = skip();
        for (i = 0;i < n;i++){
            if (isSpaceChar(b)){
                break;
            }
            c[i] = (char)b;
            b = readByte();
        }
        return i == n ? c : Arrays.copyOf(c , i);
    }
}
