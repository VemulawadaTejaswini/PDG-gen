import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N[] = new int[4];
        N[0] = sc.nextInt();
        N[1] = sc.nextInt();
        N[2] = sc.nextInt();
        N[3] = sc.nextInt();
        boolean f1, f9, f7, f4;
        f1 = Arrays.stream(N).anyMatch(a->a==1);
        f9 =Arrays.stream(N).anyMatch(a->a==9);
        f7 =Arrays.stream(N).anyMatch(a->a==7);
        f4 =Arrays.stream(N).anyMatch(a->a==4);
        String result = (f1 && f9 && f7 && f4) ? "YES" : "NO";
        System.out.println(result);
    }
}
