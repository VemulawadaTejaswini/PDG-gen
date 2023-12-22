import java.io.*;
import java.util.*;

public class Main {

    final static char BLOCK = '#';

    public static void main(String[] args){
        FastScanner sc = new FastScanner();
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] maze = new char[H][W];
        for(int i = 0; i < H; i++){
            String s = sc.next();
            for(int j = 0; j < W; j++){
                maze[i][j] = s.charAt(j);
            }
        }

        Queue<Pos> queue = new ArrayDeque<>();

        int answer = 0;
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                if (maze[i][j] == BLOCK) { continue; }

                boolean[][] isVisit = new boolean[H][W];
                int[][] counts = new int[H][W];

                int[] dx = {-1, 1, 0, 0};
                int[] dy = {0, 0, -1, 1};

                queue.add(new Pos(i, j));
                while (!queue.isEmpty()){
                    Pos current = queue.poll();
                    for(int k = 0; k < 4; k++){
                        int newX = current.x + dx[k];
                        int newY = current.y + dy[k];
                        if(newX >=0 && newX < H && newY >=0 && newY < W && !isVisit[newX][newY] && maze[newX][newY] != BLOCK){
                            isVisit[newX][newY] = true;
                            counts[newX][newY] += counts[current.x][current.y] + 1;
                            queue.add(new Pos(newX, newY));
                            answer = Math.max(answer, counts[newX][newY]);
                        }
                    }
                }

            }
        }
        System.out.println(answer);

    }
}

class Pos {
    int x;
    int y;

    public Pos(int x, int y){
        this.x = x;
        this.y = y;
    }

}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte(){
        if(ptr < buflen){
            return true;
        }else{
            ptr = 0;
            try{
                buflen = in.read(buffer);
            }catch(IOException e){
                e.printStackTrace();
            }
            if(buflen <= 0){
                return false;
            }
        }
        return true;
    }
    private int readByte(){
        if(hasNextByte()) return buffer[ptr++];
        else return -1;
    }
    private static boolean isPrintableChar(int c){
        return 33 <= c && c <= 126;
    }
    public boolean hasNext(){
        while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }
    public String next(){
        if(!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)){
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong(){
        if(!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        if(b < '0' || '9' < b){
            throw new NumberFormatException();
        }
        while(true){
            if('0' <= b && b <= '9'){
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt(){
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble(){
        return Double.parseDouble(next());
    }
}