import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * author @sahil
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int A=Integer.parseInt(str[0]);
        int B=Integer.parseInt(str[1]);
        String s=br.readLine();
        if(s.length()!=(A+B+1) || s.charAt(A)!='-')
            System.out.println("No");
        else{
            int c=0;
            //System.out.println("hello");
            //System.out.println((int)s.charAt(A));
            for(int i=0;i<s.length();++i) {
                if(i==A) continue;
                if (!((int) s.charAt(i) >= 48 && (int) s.charAt(i) <= 57)) {
                    c = 1;
                    break;
                }
            }
            if(c==1) System.out.println("No");
                else
                System.out.println("Yes");
        }
    }
}
