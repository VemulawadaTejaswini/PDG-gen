import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a12 = sc.next();
        String a13 = sc.next();
        String a11 = sc.next();
        String a21 = sc.next();
        String a22 = sc.next();
        String a23 = sc.next();
        String a31 = sc.next();
        String a32 = sc.next();
        String a33 = sc.next();

        int n = sc.nextInt();

        String[] b = new String[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.next();
        }
        if ((Arrays.asList(b).contains(a11)
            && Arrays.asList(b).contains(a12)
            && Arrays.asList(b).contains(a13))
            || (Arrays.asList(b).contains(a21)
                && Arrays.asList(b).contains(a22)
                && Arrays.asList(b).contains(a23))
            || (Arrays.asList(b).contains(a31)
                && Arrays.asList(b).contains(a32)
                && Arrays.asList(b).contains(a33))
            || (Arrays.asList(b).contains(a11)
                && Arrays.asList(b).contains(a21)
                && Arrays.asList(b).contains(a31))
            || (Arrays.asList(b).contains(a12)
                && Arrays.asList(b).contains(a22)
                && Arrays.asList(b).contains(a32))
            || (Arrays.asList(b).contains(a12)
                && Arrays.asList(b).contains(a22)
                && Arrays.asList(b).contains(a32))
            || (Arrays.asList(b).contains(a13)
                && Arrays.asList(b).contains(a23)
                && Arrays.asList(b).contains(a33))
            || (Arrays.asList(b).contains(a11)
                && Arrays.asList(b).contains(a22)
                && Arrays.asList(b).contains(a33))
            || (Arrays.asList(b).contains(a13)
                && Arrays.asList(b).contains(a22)
                && Arrays.asList(b).contains(a31))) {
                    System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
