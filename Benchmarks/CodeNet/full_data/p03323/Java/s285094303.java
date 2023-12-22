import java.io.PrintWriter;
import java.io.StreamTokenizer;

import static java.lang.Math.max;

class abc100_a {
    static StreamTokenizer in = new StreamTokenizer(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static final int getInt()throws Exception{
        in.nextToken();
        return (int)in.nval;
    }
    public static void main(String[] args)throws Exception {
        int a=getInt(),b=getInt();
        if(a+b==16){
            if(a!=b){
                out.println(":(");
            }else{
                out.println("Yay!");
            }
        }else{
            if(max(a,b)*2<=16){
                out.println("Yay!");
            }else{
                out.println(":(");
            }
        }
        out.flush();
    }
}
