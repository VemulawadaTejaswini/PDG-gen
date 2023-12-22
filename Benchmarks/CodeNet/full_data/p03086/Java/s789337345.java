import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] seq = str.toCharArray();
        for(int i = 0; i < seq.length; i++){
            if(seq[i] == 'A'){
                seq[i] = 't';
            } else if(seq[i] == 'T'){
                seq[i] = 't';
            } else if(seq[i] == 'G'){
                seq[i] = 't';
            } else if(seq[i] == 'C'){
                seq[i] = 't';
            } else {
                seq[i] = 'f';
            }
        }
        
        int end = 0;
        int ans = 0;
        int tmp = 0;
        while(end < seq.length){
            if(seq[end] == 't'){
                end ++;
                tmp ++;
            } else{
                if(ans < tmp){
                    ans = tmp;
                }
                end++;
                tmp=0;
            }
        }
        System.out.println(ans);
    }
}