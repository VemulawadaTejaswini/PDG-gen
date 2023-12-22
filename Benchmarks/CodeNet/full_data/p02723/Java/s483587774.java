import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String S[] = str.split("");
        if(S[2].equals(S[3])&&S[4].equals(S[5]))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
