import java.io.*;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();        
        String S = r.s(),
               T = r.s();
        int len = S.length();
        int[] sChar = new int[26],
              tChar = new int[26];
        for(int i = 0; i < len; i++){
            sChar[S.charAt(i)-'a']++;
            tChar[T.charAt(i)-'a']++;
        }
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        for(int i = 25; i > -1; i--){
            if(sChar[i] != tChar[i]){
                print("No");
                return;
            }
        }
        print("Yes");       
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
    }
}