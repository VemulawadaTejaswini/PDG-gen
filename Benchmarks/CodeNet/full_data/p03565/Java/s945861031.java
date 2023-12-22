import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();        
        String S1 = r.s();
        String T = r.s();
        int l1 = S1.length();
        int l2 = T.length();
        String ans = "UNRESTORABLE";
        loop: for(int i = l1-l2; i >= 0; i--){
            for(int j = 0; j < l2; j++){
                if(T.charAt(j) != S1.charAt(i+j) && S1.charAt(i+j) != '?'){
                    continue loop;
                }                
            }
            char[] temp = S1.toCharArray();
            for(int j = 0; j < l2; j++){
                temp[i+j] = T.charAt(j); 
            }
            ans = new String(temp).replace("?", "a");
            break;
        }
        println(ans);
    }
    static void print(Object o){
        System.out.print(o.toString());
    }
    static void println(Object o){
        System.out.println(o.toString());
    }
    static int Int(String s){
        return Integer.parseInt(s);
    }
    static long Long(String s){
        return Long.parseLong(s);
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
        long l() throws IOException{
            return Long(s());
        }
        long[] ll() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            long[] ll = new long[size];
            for(int j = 0; j < size; j++) ll[j] = Long(ss[j]);            
            return ll;
        }
    }
}