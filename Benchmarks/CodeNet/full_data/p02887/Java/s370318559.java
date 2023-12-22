import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String slimes = sc.next();
        String[] slimesArray = slimes.split("");
        int ans = 1;

        for (int i = 1; i < slimesArray.length; i++) {
            if (!slimesArray[i].equals(slimesArray[i - 1])) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}