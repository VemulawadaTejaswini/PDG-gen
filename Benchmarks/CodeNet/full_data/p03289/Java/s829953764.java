import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        if(s.charAt(0) == 'A'){
            int cnt = 0;
            for(int i = 2; i < s.length() - 2; i++){
                if(s.charAt(i) == 'C'){
                    cnt++;
                }
            }
            if(cnt == 1){
                int[] ac = new int[2];
                
                for(int i = 0; i < s.length(); i++){
                    if(s.charAt(i) == 'A') ac[0]++; else if(s.charAt(i) == 'C') ac[1]++;
                }
                
                if(ac[0] == 1 && ac[1] == 1){
                    System.out.println("AC");
                    return;
                }
            }
        }
        System.out.println("WA");
    }
}
