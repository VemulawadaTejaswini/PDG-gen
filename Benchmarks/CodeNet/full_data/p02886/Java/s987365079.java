import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> takoyaki = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            takoyaki.add(sc.nextInt());
        }
        sc.close();

        int ans = 0;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                ans += takoyaki.get(i) * takoyaki.get(j);
            }
        }
        System.out.println(ans);

    }
}

