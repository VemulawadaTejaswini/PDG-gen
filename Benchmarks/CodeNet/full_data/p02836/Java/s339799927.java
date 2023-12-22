import java.util.*;

class Main
{
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        count = 0;
        
        
            for (int i = 0; i < s.length() / 2; i++)  {
                for (int h = s.length() - 1; h > s.length() / 2; i++) {
                    String check1 = s.substring(i, i + 1);
                    String check2 = s.substring(i, i + 1);
                    
                    if (!check1.equals(check2)) {
                        count++;
                    }
                }
            }
        
        System.out.println(count);
        
    }
}
        