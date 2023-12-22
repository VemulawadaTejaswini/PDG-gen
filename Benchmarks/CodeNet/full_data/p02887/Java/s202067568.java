import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String slimes = sc.next();
        List<String> slimesArray = Arrays.asList(slimes.split(""));
        String ans = slimesArray.get(0);

        for (int i = 1; i < slimesArray.size(); i++) {
            if (!slimesArray.get(i).equals(slimesArray.get(i - 1))) {
                ans += slimesArray.get(i);
            }
        }
        System.out.println(ans.length());
    }
}