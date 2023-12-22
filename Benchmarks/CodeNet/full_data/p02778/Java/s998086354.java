import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int len = s.length();
        String x = "";
        for(int i = 0 ; i < len ; i++){
            x += "x";
        }

        System.out.println(x);
    }

}