import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();
        char[] cc = c.toCharArray();
        int ai = 0;
        int bi = 0;
        int ci = 0;
        char winner = 'a';
        char x = ac[ai];
        while(true){
            if(x == 'a'){
                ai++;
                if(ai >= a.length()){
                    winner = 'A';
                    break;
                }
                x = ac[ai];
            }
            if(x == 'b'){
                bi++;
                if(bi >= b.length()){
                    winner = 'B';
                    break;
                }
                x = bc[bi];
            }
            if(x == 'c'){
                ci++;
                if(ci >= c.length()){
                    winner = 'C';
                    break;
                }
                x = cc[ci];
            }
        }
        System.out.println(winner);
    }
}
