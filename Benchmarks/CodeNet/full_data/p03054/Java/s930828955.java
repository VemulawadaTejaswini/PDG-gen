package solver;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    
    int H, W, n;
    int x, y;
    String s, t;
    
    boolean okByLR(){
        int lft = y, rgt = y;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'L'){
                lft--;
            } else if(s.charAt(i) == 'R'){
                rgt++;
            }
            //---
            if(lft < 1 || rgt > W){
                return false;
            }
            //---
            if(t.charAt(i) == 'L'){
                if(rgt > 1){
                    rgt--;
                }
            } else if(t.charAt(i) == 'R'){
                if(lft < W){
                    lft++;
                }
            }
        }
        return true;
    }
    
    boolean okByUD(){
        int up = x, down = x;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'U'){
                up--;
            } else if(s.charAt(i) == 'D'){
                down++;
            }
            //---
            if(up < 1 || down > H){
                return false;
            }
            //---
            if(t.charAt(i) == 'U'){
                if(down > 1){
                    down--;
                }
            } else if(t.charAt(i) == 'D'){
                if(up < H){
                    up++;
                }
            }
        }
        return true;
    }
    
    void run() throws IOException {
        Reader in = new Reader();
        H = in.nextInt();
        W = in.nextInt();
        n = in.nextInt();
        x = in.nextInt();
        y = in.nextInt();
        s = in.readLine();
        t = in.readLine();
        
        if(okByUD() == false || okByLR() == false){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
    
    public static void main(String[] args) throws IOException {
        new Main().run();
    }
    
    static class Reader {
        final private int bufferSize = 1 << 16;
        final private DataInputStream din;
        final private byte[] buffer;
        private int bufferPointer, bytesRead;
        
        public Reader(){
            din = new DataInputStream(System.in);
            buffer = new byte[bufferSize];
            bufferPointer = bytesRead = 0;
        }
        
        public Reader(String fileName) throws IOException {
            din = new DataInputStream(new FileInputStream(fileName));
            buffer = new byte[bufferSize];
            bufferPointer = bytesRead = 0;
        }
        
        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, bufferSize);
            if(bytesRead == -1){
                buffer[0] = -1;
            }
        }
        
        private byte read() throws IOException {
            if(bufferPointer == bytesRead){
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }
        
        private void close() throws IOException {
            if(din == null){
                return ;
            }
            din.close();
        }
        
        public String readLine() throws IOException {
            byte[] buf = new byte[200005];
            int cnt = 0, c;
            while((c = read()) != -1){
                if(c == '\n'){
                    break;
                }
                buf[cnt++] = (byte)c;
            }
            return new String(buf, 0, cnt);
        }
        
        public int nextInt() throws IOException { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read();
            do{ 
                ret = ret * 10 + c - '0'; 
            } while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        }
        
        public long nextLong() throws IOException { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        }
        
        public double nextDouble() throws IOException { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (c == '.'){
                while ((c = read()) >= '0' && c <= '9'){ 
                    ret += (c - '0') / (div *= 10); 
                } 
            }
            if (neg) 
                return -ret; 
            return ret; 
        } 
    }
}
