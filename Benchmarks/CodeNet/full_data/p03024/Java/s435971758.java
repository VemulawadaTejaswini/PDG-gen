import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int c = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'o') c++;
        }
        System.out.println(c >= s.length() - 7 ? "YES" : "NO");
        scan.close();
    }
}
