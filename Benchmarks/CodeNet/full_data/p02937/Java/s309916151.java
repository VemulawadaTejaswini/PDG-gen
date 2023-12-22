import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int times = 0;
        int num = s.length() - 1;
        for(String i : t.split("")) {
            if(!(s.contains(i))) {
                System.out.println("-1");
                return;
            }
            if(num != s.length() - 1) {
                if(s.substring(num + 1).contains(i)) {
                    num = s.substring(num + 1).indexOf(i) + num + 1;
                    continue;
                }
            }
            num = s.indexOf(i);
            times++;
        }
        times--;
        System.out.println(times * s.length() + num + 1);
    }

}
