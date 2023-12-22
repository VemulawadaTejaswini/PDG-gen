import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = new String[n];

        for(int i = 0; i < n; i++){
            String[] temp = sc.nextLine().split("");
            Arrays.sort(temp);
            s[i] = String.join("", temp);
        }

        long ans = 0;
        for(int i = 0; i < n; i ++){
            for(int j = i + 1; j < n; j++) {
                if (s[i].equals(s[j])) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
        return;
    }
}
