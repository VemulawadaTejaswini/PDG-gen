
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] frq = new int[26];
        for(int i = 0 ; i < s.length() ; i++)
        {
            if( Character.isLowerCase(s.charAt(i)) )
            {
                frq[s.charAt(i)-'a']++;
            }
        }
        boolean flag = true;
        for(int i = 0 ; i < 26; i++)
            if(frq[i]%2!=0)
            {
                flag = false;
                break;
            }

        if(flag)
            System.out.println("Yes");
        else System.out.println("No");
    }
}
