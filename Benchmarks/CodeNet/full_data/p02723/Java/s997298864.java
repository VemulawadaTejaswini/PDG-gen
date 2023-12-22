import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        System.out.println(S[2]==S[3] && S[4]==S[5] ? "Yes" : "No");
    }
}

