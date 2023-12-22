import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n < m)
        {
            System.out.print("No");
            return;
        }

        ArrayList<Integer> votes = new ArrayList<>();
        int sum = 0;
        for (int i = 0;i < n; i ++)
        {
            votes.add(sc.nextInt());
            sum += votes.get(i);
        }

        Collections.sort(votes, Collections.reverseOrder());

        int preSum = 0;
        for (int i = 0; i < m; i++)
        {
            if (votes.get(i) * 4 * (i + 1) < sum)
            {
                System.out.print("No");
                return;
            }
        }
        System.out.print("Yes");
    }
}