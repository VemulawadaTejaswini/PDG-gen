import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a[] = sc.next().split("");
        String b[] = sc.next().split("");
        
        if(a[0].equals(b[2]) && a[2].equals(b[0]) && a[1].equals(b[1])) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
