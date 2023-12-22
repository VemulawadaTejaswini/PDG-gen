import java.util.*;

class Main{
    public static void main(String[] args) {       
        Scanner stdIn = new Scanner(System.in);
        char[] s = stdIn.next().toCharArray();
        long k = stdIn.nextLong();
        long answer = 0;
        int last = 0;

        

        for(int i = 0; i+1 < s.length; i++){
            if(s[i] == s[i+1]){
                s[i+1] = '@';
            }
        }

        if(s[0] == s[s.length-1]){
            s[s.length-1] = '@';
            last = 1;
        }
        
        for(int i = 0; i < s.length; i++){
            if(s[i] == '@')
                answer++;
        }
        System.out.println(answer*k - last);
   }
}