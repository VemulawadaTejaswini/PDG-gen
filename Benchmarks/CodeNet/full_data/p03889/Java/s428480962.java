import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean flag = true;
        for(int i = 0; i <= s.length() / 2; i++){
            char c = s.charAt(i);
            char cc = s.charAt(s.length() - 1 - i);
            switch(c){
                case 'p':
                    if(cc != 'q') flag = false;
                    break;
                case 'q':
                    if(cc != 'p') flag = false;
                    break;
                case 'b':
                    if(cc != 'd') flag = false;
                    break;
                case 'd':
                    if(cc != 'b') flag = false;
                    break;
            }
        }
        String ans = flag? "Yes" : "No";
        System.out.println(ans);
    }
}