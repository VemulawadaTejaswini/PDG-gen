import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main (String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int N = Integer.parseInt(lines[0]);
        lines = br.readLine().split(" ");
        ArrayList<Integer> ppl = new ArrayList<Integer>();
        for(String line:lines){
            ppl.add(Integer.parseInt(line));
        }
        Collections.sort(ppl);
        
        int min = 0;
        int max = N-1;
        int ans = 0;
        while(min<=max){
            int ave = (min+max)/2;
            if(check(ppl,ave)){
                max = ave-1;
                ans = ave;
            }else{
                min = ave+1;
            }
        }
        System.out.println(N-ans);
    }
    private static boolean check(ArrayList<Integer> ppl,int idx){
        int base = ppl.get(idx);
        int max = ppl.get(ppl.size()-1);
        int n=0;
        while(base*2 >= ppl.get(n)){
            if(n!=idx)
                base += ppl.get(n);
            ++n;
            if(base*2 >= max){
                return true;
            }
        }
        return false;
    }
    
}