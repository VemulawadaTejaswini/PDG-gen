import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(0);
        int count = 0;
        for(int i=0; i<s.length();i++){
            if(count >= 3){
                break;
            }
            if(c == s.charAt(i)){
                count++;
            }else{
                c = s.charAt(i);
                count = 1;
            }
        }

        if(count >= 3){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
