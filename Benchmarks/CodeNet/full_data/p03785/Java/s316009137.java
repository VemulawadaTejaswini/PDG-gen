import java.io.*;
import java.util.*;
import java.math.*;

class Main {

    InputStream is;
    PrintWriter out;

    boolean possible(int[] A , int [] B , int x) {
        long current = A[x];
        boolean f = true;
        int lim = (int)(1e9);
        for(int i = 1;i < A.length;i++) {
            if (B[i] == A[x]) {
                // out.println("same");
                continue;
            }
            // out.println("checking " + B[i]);
            // out.println("with " + current);
            if (B[i] > 2 * current) return false;
            current += B[i];
            if (current >= lim) return true;
        }
        return true;
    }
    
    void solve(){
        //Enter code here
        int n = ni();
        // out.println(n);
        int[] A = new int[n + 1];
        int[] B = new int[n + 1];
        for(int i = 1;i <= n;i++) {
            A[i] = ni();
            B[i] = A[i];
        }
        Arrays.sort(B , 1 , n + 1);
        // for(int i = 1;i <= n;i++) 
        //     out.println(B[i]);
        int ans = 0;
        for(int i = 1;i <= n;i++) {
            if (possible(A , B , i)) {
                ans++;
            }
        }
        out.println(ans);
    }
    public static void main(String[] args) {
        Main play = new Main();
        play.run();
    }
    void run(){
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
