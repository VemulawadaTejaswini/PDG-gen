import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char[] a = new char[s.length()];
        String out = "";
        for(int i = 0; i < s.length(); i++){
            a[i] = s.charAt(i);
        }
        for(int i = 0; i < s.length(); i++){
            if(a[i] == 'B'){
                if(i != 0){
                    a[i - 1] = ' ';
                }
            }
        }
        for(int i = 0; i < s.length(); i++){
            if(a[i] != ' ' && a[i] != 'B'){
                out += String.valueOf(a[i]);
            }
        }
        System.out.print(out);
    }
}
