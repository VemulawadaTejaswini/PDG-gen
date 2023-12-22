import java.io.*;
import java.util.*;
import java.lang.*;


class Solution{

    void solve() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N =  Integer.parseInt(bufferedReader.readLine());

        String[] input = bufferedReader.readLine().split(" ");

        int sum = 0;

        HashSet<Integer> hashSet = new HashSet<Integer>();

        
        for(int i = 0 ; i < input.length ; i++){
            int number = Integer.parseInt(input[i]);
            sum+=number;
            
            // if(!hashSet.contains(number)){
            //     hashSet.add(number);
                

            // }
            
        }

        int mean  = (int)Math.round(sum/(double)input.length);


        int offset = 0;

        for(int i = 0 ; i < input.length ; i++){
            offset+=(int)Math.pow((Integer.parseInt(input[i])-mean),2);
        }

       System.out.println(offset);
    }    

}

class Main{
    public static void main(String[] args) throws IOException{
        new Solution().solve();
    }
}