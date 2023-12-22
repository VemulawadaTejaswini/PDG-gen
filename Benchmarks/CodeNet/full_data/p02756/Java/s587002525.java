import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int b = sc.nextInt();

        Test[] array = new Test [b];

        for(int i = 0; i < b; i++) {
            array[i] = new Test();
        }

        for (int i = 0; i < b; i++) {
            if (sc.nextInt() == 1) {
                array[i].a = 1;
            } else {
                array[i].a = 2;
                array[i].b = sc.nextInt();
                array[i].c = sc.next();
            }
        }

        StringBuilder ans = new StringBuilder(a);

        for (int i = 0; i < b; i++) {
            if (array[i].a == 1) {
                ans.reverse();
            } else {
                if (array[i].b == 1) {
                    ans.insert(0, array[i].c);
                } else {
                    ans.append(array[i].c);
                }
            }
        }

        System.out.println(ans);

    }

}

class Test {
    int a;
    int b;
    String c;
}


