import java.util.*;

class Main
{
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        
        StringBuilder buf = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            buf.append(s.substring(i, i + 1));
            buf.append(t.substring(i, i + 1));
        }
        
        String ans = buf.toString();
        
        System.out.println(ans);
        
        
    }
}
        