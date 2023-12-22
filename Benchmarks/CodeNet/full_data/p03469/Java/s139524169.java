import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.next().split("/");
        String correct = "2018";
        a[0] = correct;
        System.out.println(a[0] + "/" + a[1] + "/" + a[2] );
    }
}
