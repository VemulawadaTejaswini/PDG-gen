import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String o = sc.next();
        String e = sc.next();
        String newStr = new String();
        int tempO = o.length();
        int tempE = e.length();
        int i;
        for (i = 0; i < tempE; i++) {
                newStr+=o.charAt(i);
                newStr+=e.charAt(i);
        }
        if (tempO > i)
            newStr+=o.charAt(tempO - 1);
        System.out.println(newStr);
    }
}