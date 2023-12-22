import javax.xml.stream.events.Characters;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.setCharAt(K-1, Character.toLowerCase(s.charAt(K-1)));
        System.out.println(sb.toString());
        sc.close();
    }
}