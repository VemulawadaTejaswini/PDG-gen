import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();

        Boolean ans = true;
        String strings[] = s.split("-");
        if(strings.length != 2)
            ans = false;
        else if(strings[0].length() != a)
            ans = false;
        else if(strings[1].length() != b)
            ans = false;

        if(ans)
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
        return;
    }
}
