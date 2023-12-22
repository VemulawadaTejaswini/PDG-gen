import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        String stone = kbd.next();
        String[] s = stone.split("");
        List<String> stones = Arrays.asList(s);
        int coun = 0;
        for (int i = 0; i < n; i++) {
            if (stones.get(i).equals(".")) {
                if (stones.subList(0, i).contains("#")) {
                    coun++;
                }
            }
        }
        System.out.println(coun);
    }
}