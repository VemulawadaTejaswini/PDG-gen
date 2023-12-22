import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = str.length();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append("x");
        }
        System.out.print(sb.toString());
    }
}
