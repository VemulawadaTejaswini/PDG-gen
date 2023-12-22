import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] card = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                card[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        for (int i = 0; i < 3; i++) {
            if ((set.contains(card[i][0]) && set.contains(card[i][1]) && set.contains(card[i][2])) ||
                (set.contains(card[0][i]) && set.contains(card[1][i]) && set.contains(card[2][i]))) {
                    System.out.println("Yes");
                    return;
                }
        }
        if ((set.contains(card[0][0]) && set.contains(card[1][1]) && set.contains(card[2][2])) || 
            (set.contains(card[2][0]) && set.contains(card[1][1]) && set.contains(card[0][2]))) {
                System.out.println("Yes");
                return;
            }
            
		System.out.println("No");
   }

}
