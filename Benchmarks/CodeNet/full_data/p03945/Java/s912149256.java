import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        int left = 0;
        while(left<len){
            int right = left+1;
            while(right<len&&s.charAt(right)==s.charAt(left)) right++;
            sb.append(s.charAt(left));
            left=right;
        }
        String res = sb.toString();
        System.out.println(res.length()-1);
    }
}
