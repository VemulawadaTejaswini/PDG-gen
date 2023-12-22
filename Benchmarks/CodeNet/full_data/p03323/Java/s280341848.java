import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Math.max;

class abc100_a {
    //static StreamTokenizer in = new StreamTokenizer(System.in);
    static StringTokenizer cin;
    static PrintWriter out = new PrintWriter(System.out);
    static final void in_init()throws Exception{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder s=new StringBuilder();
        while(true){
            String st=bf.readLine();
            if(st==null){
                break;
            }
            s.append(' ');
            s.append(st);
        }
        cin=new StringTokenizer(s.toString());
    }
    static final int getInt()throws Exception{
        return Integer.parseInt(cin.nextToken());
    }
    public static void main(String[] args)throws Exception {
        in_init();
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
