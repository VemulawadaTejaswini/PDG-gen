import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        String s = sc.next();
//        Long x = sc.nextLong();
        String s = a+""+b+""+c;
        if(s.equals("557")||s.equals("575")||s.equals("755")){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
