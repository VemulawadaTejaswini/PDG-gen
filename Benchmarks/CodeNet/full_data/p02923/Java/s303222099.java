import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int H[] = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = s.nextInt();
        }
        int cnt = 0;
        List<Integer> l = new ArrayList<>();

            for (int j = 0; j < N; j++) {
                if(j==0)
                    continue;
                if (H[j-1] >= H[j])
                cnt++;
                else {
                    l.add(cnt);
                    cnt=0;
                }
            }
            l.add(cnt);
        Collections.sort(l, Collections.reverseOrder());
        System.out.print(l.get(0));
    }
}
