import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        int n = scanner.nextInt();
        for (int i = 0; i < n; i ++){
            int t = scanner.nextInt();
            if (t == 1)
                str = new StringBuffer(str).reverse().toString();
            else if (t == 2){
                int ans = scanner.nextInt();
                String string = scanner.next();
                if (ans == 2)
                    str = str + string;
                else if (ans == 1)
                    str = string + str;
            }
        }
        System.out.println(str);

    }
}
