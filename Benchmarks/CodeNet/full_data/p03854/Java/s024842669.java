import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
            
        String S = br.readLine();
        int n = S.length();
        if(recurse(S))
            System.out.println("YES");
        else
            System.out.println("NO");

    }
    public static boolean recurse(String s){
        if(s.length()==0)
            return true;
        boolean res = false;
        if(s.startsWith("dreamera")){
            res = recurse(s.substring(5,s.length()));
        }
        else if(s.startsWith("dreamer")){
            res = recurse(s.substring(7,s.length()));
        }
        else if(s.startsWith("dream")){
            res = recurse(s.substring(5,s.length()));
        }
        else if(s.startsWith("eraser")){
            res = recurse(s.substring(6,s.length()));
        }
        else if(s.startsWith("erase")){
            res = recurse(s.substring(5,s.length()));
        }
        return res;
    }
}
