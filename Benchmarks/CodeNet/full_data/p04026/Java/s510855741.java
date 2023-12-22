import java.io.*;
import java.util.*;


class Solution{

    

    boolean allOkay(int[] alphabets , int n){
        for(int i =0;i<alphabets.length;i++){
            if(alphabets[i]>n/2){
                return false;
            }
        }

        return true;
    }   



    boolean recurse(int start, int end , int[] alphabets , String a){

            if((end-start+1)<2){
                //System.out.println("-1 -1");
                return true;
            }

            //System.out.println(start + "," + end);

            if(!allOkay(alphabets,end-start+1)){
                System.out.println((start+1) + " "  + (end+1));
                return false;
            }

            int[] a1 = new int[26];

            for(int i = 0 ; i < alphabets.length; i++){
                a1[i] = alphabets[i];
            }

            a1[a.charAt(end)-'a']--;
            
            boolean p = recurse(start, end-1, a1, a);

            if(!p){
                //System.out.println("here1");
                
                return false;
            }

            int[] a2 = new int[26];

            for(int i = 0 ; i < alphabets.length; i++){
                a2[i] = alphabets[i];
            }
            

            a2[a.charAt(start)-'a']--;

            boolean q = recurse(start+1, end, a2, a);

            if(!q){
                //System.out.println("here2");
                //System.out.println((start+2)+" "+(end+1));
                return false;
            }
            

            return p && q;
        

    }
    void solve() throws IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String a = bufferedReader.readLine();

        int start=0;
        int end = a.length()-1;

        int[] alphabets = new int[26];


        for(int i = 0;i<a.length();i++){
            alphabets[a.charAt(i)-'a']++;
        }

        


        boolean ab = recurse(start,end,alphabets,a);

        if(ab){
            System.out.println("-1 - 1");
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException{
        new Solution().solve();
    }   
}