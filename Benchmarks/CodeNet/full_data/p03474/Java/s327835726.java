import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();

        Boolean ans = true;
        int index;
        if(s.indexOf('-') == -1)
        {
            System.out.println("No");
            return;
        }
        for(index = 0; s.charAt(index) != '-'; index++);
        if(index != a) ans = false;
        if(s.length() - index - 1 != b) ans = false;

        if(ans)
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
        return;
    }
}
