import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int b = sc.nextInt();

        StringBuilder ans = new StringBuilder(a);

        int rev = 0;

        for (int i = 0; i < b; i++) {
            if (sc.nextInt() == 1) {
                rev++;
            } else {
                if (sc.nextInt() == 1) {
                    if (rev % 2 == 0){
                        ans.append(sc.next());
                    } else {
                        ans.insert(0, sc.next());
                    }
                } else {
                    if (rev % 2 == 0){
                        ans.insert(0, sc.next());
                    } else {
                        ans.append(sc.next());
                    }
                }
            }
        }

        if (rev % 2 == 0) {
            ans.reverse();
        }

        System.out.println(ans);

    }

}


