import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int ans = 0;
        int a = Integer.parseInt(sc.next());
        String[] ary = sc.next().split("");
        for(int i = 0; i < a; i++)
        {
            if("I".equals(ary[i])) x++;
            else if("D".equals(ary[i])) x--;
            if(ans < x) ans = x;
        }
        System.out.println(ans);      
    }
}