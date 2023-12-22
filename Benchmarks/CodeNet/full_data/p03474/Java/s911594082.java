import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{

    static final FastReader in = new FastReader();
    static final FastWriter out = new FastWriter();

    public static void main(String[] args) throws IOException{
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        String s = in.nextLine();
        boolean good = true;
        for (int i = a; i < a+b+1; i++){
            if (i == a){
                if (s.charAt(i) != '-') good = false;
            }else{
                char c = s.charAt(i);
                if (!Character.isDigit(c))
                    good = false;
                else if (Integer.parseInt(String.valueOf(c))>9||Integer.parseInt(String.valueOf(c))<0)
                    good = false;
            }
        }
        out.pl(good?"Yes":"No");
        out.close();
    }
}
class FastReader{ 
    BufferedReader br; 
    StringTokenizer st; 
    public FastReader() { 
        br = new BufferedReader(new InputStreamReader(System.in)); 
    } 
    String next(){ 
        while (st == null || !st.hasMoreElements()) { 
            try{ 
                st = new StringTokenizer(br.readLine()); 
            }catch (IOException  e){ 
                e.printStackTrace(); 
            } 
        } 
        return st.nextToken(); 
    } 
    int nextInt(){ 
        return Integer.parseInt(next()); 
    } 
    long nextLong(){ 
        return Long.parseLong(next()); 
    } 
    double nextDouble(){ 
      return Double.parseDouble(next()); 
    } 
    String nextLine(){ 
        String str = ""; 
        try{ 
            str = br.readLine(); 
        } 
        catch (IOException e){ 
            e.printStackTrace(); 
        } 
        return str; 
    }
}
class FastWriter{
    PrintWriter out;
    FastWriter(){
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	out.flush();
    }
    void pl(Object o){
        out.write(o.toString());
	    out.write("\n");
        out.flush();
    }
    void pl(){
        out.write("\n");
    }
    void p(Object o){
        out.write(o.toString());
    }
    void close(){
        out.flush();
        out.close();
    }  
}
