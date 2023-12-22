import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String str = br.readLine();

            boolean one = false, two = false, three = false;

            one = ischeck(str);
            two = ischeck(str.substring(0, (str.length()-1)/2));
            three = ischeck(str.substring((str.length()+3)/2-1, str.length()));

            if(one && two && three){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
   
    }

    public static boolean ischeck(String s){
        int n = s.length();
        
        for(int i = 0; i < n/2; i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
              return false;
            } 
        }
        
        return true;
    }
}