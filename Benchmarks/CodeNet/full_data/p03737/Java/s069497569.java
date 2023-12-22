import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append((char)(S.charAt(0)+'A'-'a'));
        int i=1;
        while(S.charAt(i)!=' ') i++;
        sb.append((char)(S.charAt(++i)+'A'-'a'));
        while(S.charAt(i)!=' ') i++;
        sb.append((char)(S.charAt(++i)+'A'-'a'));
        System.out.println(sb.toString());
    }
}
