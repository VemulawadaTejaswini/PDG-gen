import java.util.*;
import java.lang.*;
import java.io.*;

class Information{
	int x,y,h;
	public Information(int x, int y, int h){
		this.x = x;
		this.y = y;
		this.h = h;
	}
	
	
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Information[] info = new Information[N];
        for(int n=0;n<N;n++){
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	int h = sc.nextInt();
        	info[n] = new Information(x,y,h);
        }
        
        for(int cx=0;cx<=100;cx++)for(int cy=0;cy<=100;cy++){
        	int minH = 1;
        	int maxH = 1000000000;
        	boolean ok = true;
        	for(Information i:info){
        	    if(i.h==0){
        	    	int Hbound = Math.abs(i.x-cx)+Math.abs(i.y-cy);
        	    	if(minH>Hbound)ok = false;
        	    	maxH = Hbound;
        	    }else{
        	    	int H = Math.abs(i.x-cx)+Math.abs(i.y-cy)+i.h;
        	    	if(minH>H||maxH<H) ok=false;
        	    	else{
        	    		minH = H;
        	    		maxH = H;
        	    	}
        	    }
        	}
        	if(ok) System.out.println(cx+" "+cy+" "+minH);
        }
    }
}
