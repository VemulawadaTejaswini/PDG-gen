import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<w+2;i++)sb.append('#');
        sb.append('\n');
        for(int i=0;i<h;i++)sb.append('#').
                append(sc.next().toCharArray()).append("#\n");
        for(int i=0;i<w+2;i++)sb.append('#');
        System.out.println(sb);
    }
}
