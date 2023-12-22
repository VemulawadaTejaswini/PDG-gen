import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.compareTo("zyxwvutsrqponmlkjihgfedcba") == 0){
            System.out.println(-1);
            return;
        }else if(s.length() == 26){
            for(int i = 0; i < 24; i++)
                System.out.print(s.charAt(i));
            System.out.print(s.charAt(25) + "" +  s.charAt(24));
        }else{
             char[] c = new char[26];
             for(int i = 0; i < s.length(); i++)
                c[s.charAt(i) - 'a']++;
             char next = 'a';
            for(char i = 0; i < s.length(); i++)
               if(c[i] == 0){
                  next += (char)i;
                    System.out.println(s + next);
                    return;
            }
        }
    }
}