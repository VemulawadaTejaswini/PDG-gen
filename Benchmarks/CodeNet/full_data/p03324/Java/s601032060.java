import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k=sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(k));
        for(int i=0; i<n; i++) sb.append("00");
        System.out.println(sb.toString());
    }
}