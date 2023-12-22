import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = sc.nextInt();
        String[] strs = new String[n];
        for(int i = 0; i < n; i++)
            strs[i] = sc.next();

        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++)
            sb.append(strs[i]);
        System.out.println(sb.toString());
    }
}