import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        char[] str = br.readLine().toCharArray();
        int sz = str.length;
        
        // pre
        int hash = 'R'+'G'+'B';
        System.out.println((char)(hash-'R'-'G'));
        HashMap<Character, Integer> index = new HashMap<>();
        index.put('R', 0);
        index.put('G', 1);
        index.put('B', 2);
        int[][] counts = new int[3][sz+1];
        
        for(int i = 0; i < sz; ++i){
            counts[0][i+1] += counts[0][i];
            counts[1][i+1] += counts[1][i];
            counts[2][i+1] += counts[2][i];
            char curr = str[i];
            if(curr == 'R')
                counts[0][i+1] += 1;
            if(curr == 'G')
                counts[1][i+1] += 1;
            if(curr == 'B')
                counts[2][i+1] += 1;
        }
        
        int inner = 0;
        int outer = 0;
        int id = 0;
        long res = 0;
        for(int i = 0; i < sz; ++i){
            char iVal = str[i];
            for(int j = i+1; j < sz; ++j){
                char jVal = str[j];
                if(jVal == iVal)
                    continue;
                id = index.get((char)(hash-iVal-jVal));
                inner = 0;
                outer = 0;
                // search in outer part
                if(2*j-i < sz)
                    outer = counts[id][sz] - counts[id][2*j-i+1];
                // search in inner part
                if(j-i > 1)
                    inner = counts[id][Math.min(sz,2*j-i)] - counts[id][j+1];
                // early break if no third char in rest of segment
                if(counts[id][sz]-counts[id][j] == 0)
                    break;
                res += inner + outer;
            }
        }
        System.out.println(res);
    }
}