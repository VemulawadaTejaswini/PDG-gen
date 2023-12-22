import java.util.*;
import java.lang.*;
import java.io.*;
//for save
public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] nc = br.readLine().split(" ");
        int n = Integer.parseInt(nc[0]);
        long c = Long.parseLong(nc[1]);
        long max_so_far = 0;
        long cur = 0;
        int startindex = 0;
        int totalelem = 0;
        
        long[] xarr = new long[2*n];
        long[] varr = new long[2*n];
        long x_so_far = 0;
        
        for(int i = 0; i < n; i++) {
            String[] xv = br.readLine().split(" ");
            long x = Long.parseLong(xv[0]);
            long v = Long.parseLong(xv[1]);
            varr[i] = v;
            varr[i+n] = v;
            
            xarr[i] = x - x_so_far;
            x_so_far = x;
            xarr[i+n] = xarr[i];
        }
        xarr[n] += c - x_so_far;
        
        for(int i = 0; i < 2*n; i++){
            totalelem++;
            if(totalelem > n){
                cur -= varr[startindex] - xarr[startindex];
                startindex++;
                totalelem--;
            }
            cur += varr[i] - xarr[i];
            if(max_so_far < cur){
                max_so_far = cur;
            }
            
            System.out.println(cur);
            if(cur < 0){ 
                cur = 0;
                startindex = i+1;
            }
        }
        System.out.println(totalelem);
        System.out.println(max_so_far);
    }
}
