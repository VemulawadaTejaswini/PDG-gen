
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        if (S.charAt(0) == 'A') {
            System.out.println(judge(S) ? "AC" : "WA");
        } else {
            System.out.println("WA");
        }
    }
    private static boolean judge(String str){
        str=str.substring(2,str.length()-1);
        if(str.contains("C")){
            return (str.indexOf("C")==str.lastIndexOf("C"));
        }else{
            return false;
        }
    }
}
