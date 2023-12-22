import java.util.*;
import java.io.*;

public class Main{
    static PrintWriter out;
    static Scanner in;
    public static void main(String args[]){
	in = new Scanner(System.in);
	out = new PrintWriter(System.out);
	solve();
	in.close();
	out.close();
    }

    public static void solve(){
        int r = in.nextInt();
	int g = in.nextInt();
	int b = in.nextInt();
	int rgb = 100*r+10*g+b;
	if(rgb%4==0){
	    out.println("YES");
	}else{
	    out.println("NO");
	}

    }
}
