import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        Shift_Letter(S,N);
    }
    
    public static void Shift_Letter(String S, int N) {
        //大文字アルファベットはA65 - Z90
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<S.length(); i++) {
            char c = S.charAt(i);
            c = (char)((((int)c - 65 + N) % 26) + 65);
            sb.append(c);
        }
        System.out.println(sb);
    }
}