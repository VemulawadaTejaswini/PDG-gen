import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();
        int N = r.i();
      	int[] H = r.ii();
      	int num = 1;
        loop: for(int i = 1; i < N; i++){
            for(int j = 0; j < i; j++){
                if(H[i] < H[j]){
                    continue loop;
                }
            }
            num++;
        }        
        print(num);
    }
    static void print(String s){
        System.out.println(s);
    }
  	static void print(int i){
        System.out.println(i);
    }
    static void print(double d){
        System.out.println(d);
    }
    static void print(long l){
        System.out.println(l);
    }
    static class Reader extends BufferedReader{
        Reader(){
            super(new InputStreamReader(System.in));
        }
        String s() throws IOException{
            return readLine();
        }
        String[] ss() throws IOException{
            return readLine().split(" ");
        }
        int i() throws IOException{
            return Integer.parseInt(readLine());
        }
        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++){
                ii[j] = Integer.parseInt(ss[j]);
            }
            return ii;
        }
    }
}