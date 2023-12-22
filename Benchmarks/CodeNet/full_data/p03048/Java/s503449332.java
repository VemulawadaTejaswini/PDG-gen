import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();    
        int[] a = r.ii();
        int count = 0;
        loop: for(int i = 0; i < 3001; i++){
            for(int j = 0; j < 3001; j++){
                int rR = a[3]-a[2]*i-a[1]*j;
                if(rR >= 0){
                    if(rR%a[0] == 0){
                        count++;
                    }
                }
                else{
                    continue loop;
                }
            }
        }
        print(count);
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