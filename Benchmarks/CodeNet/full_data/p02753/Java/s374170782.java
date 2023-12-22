import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String S;
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine();
        int count = 0;
        for(int i  = 1 ; i < S.length() ; i++)
        {
            if(S.charAt(0) == S.charAt(i))
            {
                count++;
            }
        }
        System.out.println(count == 2 ? "No" : "Yes");
    }
}
