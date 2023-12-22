import java.util.Scanner;

/**
 * 2018-04-08
 * https://beta.atcoder.jp/contests/abc079/tasks/abc079_a
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Character c1 = s.charAt(0);
        Character c2 = s.charAt(1);
        Character c3 = s.charAt(2);
        Character c4 = s.charAt(3);

        String ans = null;

        if(c1==c2 && c1==c3 ){
            ans ="Yes";
        }else if(c4==c3 && c4==c2){
            ans ="Yes";
        }else{
            ans ="No";
        }
        
        System.out.println(ans);
    }
}