import java.util.*;
import java.io.*;
 
public class Main {
    public static String solve(int N, int Yen){
        for(int x=0;x<=Yen/10000;x++){//max 2000
        	for(int y=0;y<=(Yen-x*10000)/5000;y++){//max 4000
        	    int z = (Yen - x*10000 - y*5000) /1000;
        	    if(x+y+z==N) return x+" "+y+" "+z;
        	}
        }
        return "-1 -1 -1";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Yen = sc.nextInt();
        
        System.out.println(solve(N,Yen));
    }
}