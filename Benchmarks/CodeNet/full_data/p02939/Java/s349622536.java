import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        char[] c = s.toCharArray();
        sc.close();

        int idx = 0;
        int count = 0;

        while(idx < s.length()-1){
            if(idx == 0){
                count++;
                idx++;
            } else {
                if(c[idx] == c[idx+1]){
                    count += 2;
                    idx += 3;
                }
                else{
                    idx++;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}