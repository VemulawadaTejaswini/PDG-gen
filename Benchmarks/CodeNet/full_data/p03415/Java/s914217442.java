import java.util.*;
import java.lang.reflect.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strs = new ArrayList<String>();
        for(int i = 0; i < 3; i++){
            String s = sc.nextLine();
            strs.add(s);
        }
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for(int i = 0; i < 3; ++i){
            a.append(strs.get(i).charAt(i));
            b.append(strs.get(2-i).charAt(2-i));
        }
        System.out.println(a);
    }
}