import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();        
        int N = r.i();
        int[] a = r.ii();
        Arrays.sort(a); 
        ArrayList<Integer> countList = new ArrayList<>();
        for(int i = 0; i < N; ){
            int element = a[i];
            int count = 0;
            while(i < N && element == a[i]){
                count++;
                i++;
            }
            countList.add(count);
        }       
        
        Iterator<Integer> iterator = countList.iterator();
        int prev = iterator.next();
        int ans = prev;
        if(iterator.hasNext()){
            int now = iterator.next();
            ans += now;
            int next;
            while(iterator.hasNext()){
                next = iterator.next();
                int x = prev + now + next;
                if(ans < x)
                   ans = x;
                prev = now;
                now = next;
            }
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