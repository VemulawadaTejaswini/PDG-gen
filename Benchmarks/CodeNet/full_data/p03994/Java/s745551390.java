import java.util.*;

public class Main {

    private static int n1(char ch){
        if (ch < 'z')
            return 'z' - ch + 1;
        else
            return 1;
    }

    private static char n2(char ch, int offset){
        if (ch + offset > 'z')
            return (char)(ch + offset - 26);
        else
            return (char)(ch + offset);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuffer sb=new StringBuffer(str);
        int n = sc.nextInt();
        int i;
        for (i = 0; i < str.length() -1; i++){
            if (n >= n1(str.charAt(i))){
                n -= n1(str.charAt(i));
                sb.setCharAt(i, 'a');
            } else {
                continue;
            }
        }
        int tmp = n % 26;
        char last = str.charAt(str.length()-1);
        sb.setCharAt(str.length()-1, n2(last, tmp));


        System.out.println(sb.toString());
    }
}