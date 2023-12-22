import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.next());
        Integer Q = Integer.parseInt(scanner.next());
        String S = scanner.next();

        String[] slist = new String[Q];

        for (int i = 0; i < Q; i++) {
            Integer l = Integer.parseInt(scanner.next()), r = Integer.parseInt(scanner.next());
            String tmp = S.substring(l-1,r);
            slist[i] = tmp;
        }

        for (int i = 0; i < slist.length; i++) {
            Integer fi = 0, count = 0;
            while(true) {
                Integer ti = slist[i].indexOf("AC", fi);
                if(ti >= 0) {
                    fi = ti + 1;
                } else break;
                count++;
            }
            System.out.println(count);
        }
    }
}