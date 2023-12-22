import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int index = 0;
        while(index < s.length()){
            char c = s.charAt(index);
            if(c == 'd'){
                if(index+7 >= s.length() || s.charAt(index+7) == 'a'){
                    index += 5;
                }else{
                    index += 7;
                }
            }else if(c == 'e'){
                if(index+5 >= s.length() || s.charAt(index+5) != 'r'){
                    index += 5;
                }else{
                    index += 6;
                }
            }else{
                break;
            }
        }
        System.out.println(index == s.length() ? "YES" : "NO");
    }
}
