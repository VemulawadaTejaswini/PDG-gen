import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();
        int[] a = r.ii();
        int ans = 0;
        for(int i = a[0]; i <= a[1]; i++){
            String s = String.valueOf(i);
            if(s.charAt(0) != s.charAt(4) || s.charAt(1) != s.charAt(3))
                continue;
            ans++;
        }
        print(ans);
    }

    static void print(Object o){
        System.out.println(o.toString());
    }
    static class Reader extends BufferedReader{
        Reader(){
            super(new InputStreamReader(System.in));
        }

        String s() throws IOException{
            return readLine();
        }

        String[] ss() throws IOException{
            return s().split(" ");
        }

        int Int(String s){
            return Integer.parseInt(s);
        }

        int i() throws IOException{
            return Int(s());
        }

        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Int(ss[j]);
            return ii;
        }
    }
}
