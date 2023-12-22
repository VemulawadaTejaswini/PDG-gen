import java.io.*;
import java.util.*;

class Solution{
    int N;
    int K;
    String[] strings;

    String[][] dp;

    String recurse(int index,String current){

        //System.out.println(current);

        if(current.length() == K){
            return current;
        }

        
        if(index >= N || current.length() > K){
            return ""; 
        }

        String answer = null;

        if(current.length() < K){
            if(dp[index][current.length()] == null){
                dp[index][current.length()] = recurse(index+1,current);
            }
        
            if(dp[index][current.length()] != ""){
                answer = dp[index][current.length()];
            }

        }

        String toAdd = strings[index];


        if(current.length() + toAdd.length() <= K){
            if(dp[index][current.length()+toAdd.length()] == null){
                
                dp[index][current.length()+toAdd.length()] = recurse(index+1,current+toAdd);
                
            }

            //System.out.println(dp[index][current.length()+toAdd.length()]);

            if(dp[index][current.length()+toAdd.length()] != ""){
                if(answer == null || dp[index][current.length()] == null || (dp[index][current.length()+toAdd.length()].compareTo(dp[index][current.length()]) < 0)){
                    answer = dp[index][current.length()+toAdd.length()];
                }
            }

        }
        
        return (answer!=null)?answer:"";

    }


    void solve() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bufferedReader.readLine().split(" ");
        
        N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);

        //System.out.println(N+","+K);
        
        strings = new String[N];
        
        for(int i=0;i<N;i++){
            strings[i] = bufferedReader.readLine();
        }
        

        dp = new String[N][K+1];


        
        System.out.println(recurse(0,""));

    }


}

public class Main {

    public static void main(String[] args) throws IOException{

        new Solution().solve();

    }

}