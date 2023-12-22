import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().solove();
    }

    public void solove() {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int k = sc.nextInt();

        Set<String> subStringsSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length() + 1; j++) {
                subStringsSet.add(s.substring(i, j));
            }
        }

        ArrayList<String> subStringsList = new ArrayList<>(subStringsSet);
        Collections.sort(subStringsList);

        System.out.println(subStringsList.get(k));
    }

}
