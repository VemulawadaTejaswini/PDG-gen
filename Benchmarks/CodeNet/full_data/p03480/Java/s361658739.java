import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char c = s.charAt(0);
        int zeroCount = s.charAt(0)=='0' ? 1 : 0;
        boolean changed = false;
        int count = 1;
        int max = 1;
        for(int i = 1; i < s.length(); i++){
            char currentC = s.charAt(i);
            if(c == currentC){
                count++;
            }else{
                if(count > max){
                    max = count;
                }
                count = 1;
                c = currentC;
                changed = true;
            }
            if(currentC == '0'){
                zeroCount++;
            }
        }
        if(count > max){
            max = count;
        }
        if(s.charAt(0) == s.charAt(s.length()-1) && changed){
            max++;
        }
        if(zeroCount == s.length()){
            max = 0;
        }
        System.out.println(max);
    }
}
