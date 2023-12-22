import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        for(int i = 0; i < S.length(); i++){
            int c = S.charAt(i) + N;
            if(c > 90){
                c -= 26;
            }
            System.out.print((char)c);
        }
        System.out.println();
    }
}
