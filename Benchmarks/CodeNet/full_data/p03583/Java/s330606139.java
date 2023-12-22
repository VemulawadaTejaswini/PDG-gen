import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        if(N%2==0){
        	long h = N;
        	long n = N;
        	long w = N/2;
        	System.out.println(h+" "+n+" "+w);
        }else{
        	//4hnw = nwN + hwN + nhN
        	//h(4nw-wN-nN)=nwN
        	//3500^2 search...?
        	for(long n=1;n<=3500;n++){
        		for(long w=1;w<=3500;w++){
        			if(4*n*w-w*N-n*N>0 && (n*w*N)%(4*n*w-w*N-n*N)==0){
        				long h = (n*w*N)/(4*n*w-w*N-n*N);
        				System.out.println(h+" "+n+" "+w);
        				System.exit(0);
        			}
        		}
        	}
        }
    }
}