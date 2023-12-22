import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        char[] chars = S.toCharArray();
        char[] front = new char[chars.length/2];
        for(int i=0; i<front.length; i++){
            front[i] = chars[i];
        }
        char[] back = new char[chars.length - front.length];
        int j = 0;
        for(int i=chars.length-1; front.length<=i; i--){
            back[j] = chars[i];
            j++;
        }
        // System.out.println(front[0] + " " + front[1]);
        // System.out.println(back[0] + " " + back[1]);

        int cnt = 0;
        for(int i=0; i<front.length; i++){
            if(front[i]!=back[i]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}