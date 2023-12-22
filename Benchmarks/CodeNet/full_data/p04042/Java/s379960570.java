import java.io.*;
import java.util.*;

class Solution{
    int N;
    int K;
    String[] strings;

    String answer = "";

    void recurse(int index,StringBuilder current){
        //System.out.println(current);
        


        if(current.length() == K){
            if(current.toString().compareTo(answer) < 0 || answer.length() == 0){
                answer = current.toString();
            }
        }

        if(index >= N){
            return ; 
        }

        

        recurse(index+1,current);
        int start = current.length();
        int end = current.length()+strings[index].length();

        recurse(index+1,current.append(strings[index]));
        current.delete(start,end);

    }


    void solve() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bufferedReader.readLine().split(" ");
        
        N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);

        strings = new String[N];

        for(int i=0;i<N;i++){
            strings[i] = bufferedReader.readLine();
        }

        recurse(0,new StringBuilder());

        System.out.println(answer);

    }


}

public class Main {

    public static void main(String[] args) throws IOException{

        new Solution().solve();

    }

}