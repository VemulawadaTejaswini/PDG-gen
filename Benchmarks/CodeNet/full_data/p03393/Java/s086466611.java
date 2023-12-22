import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main
{
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        String ans = "-1";

        Set<Character> chsSet = new HashSet();
        for (char ch : text.toCharArray()) chsSet.add(ch);
        System.err.println(chsSet);
        if (text.length() < 26)
        {
            for (int i = 0; i < 26; i++)
            {
                char ch = (char) ('a' + i);
                if (!chsSet.contains(ch))
                {
                    ans = text + ch;
                    break;
                }
            }

        } else
        {
            OUTER:
            for (int i = 24; i >= 0; i--)
            {
                if (text.charAt(i) < text.charAt(i + 1))
                {
                    for (int j = 25; j > i; j--)
                    {
                        if (text.charAt(i) < text.charAt(j))
                        {
                            ans = text.substring(0, i) + text.charAt(j);
                            break OUTER;
                        }
                    }
                }
            }
        }

        System.out.println(ans);
    }

    static public void main(String[] args)
    {
        new Main().run();
    }
}