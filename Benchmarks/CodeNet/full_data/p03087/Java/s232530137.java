import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();
        StringBuilder sb = new StringBuilder(S);
        for (int i=0; i<Q; i++) {
            int li = sc.nextInt() -1;
            int ri = sc.nextInt() ;
            System.out.println(sb.substring(li, ri)
                    .replace("AC", "X")
                    .replaceAll("[^X]","")
                    .length());
        }
    }

}