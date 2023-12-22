import java.util.Scanner;

public class Main {

    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = stdIn.nextInt();
        int k = stdIn.nextInt();
        String s = stdIn.next();

        k--;

        char[] cs = s.toCharArray();
        if(cs[k] == 'A'){
            cs[k] = 'a';
        }else if(cs[k] == 'B'){
            cs[k] = 'b';
        }else if(cs[k] == 'C'){
            cs[k] = 'c';
        }

        s = "";
        for(int i=0; i<n; i++){
            s += cs[i];
        }
        System.out.println(s);
    }
}