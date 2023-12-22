import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append("2018/01/");
        sb.append(S.charAt(8));
        sb.append(S.charAt(9));
        String ans = sb.toString();
        System.out.println(ans);
    }
}