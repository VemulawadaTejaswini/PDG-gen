import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        String ans = "";
        List<String> strs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            strs.add(sc.next());
        }

        strs.stream().sorted((x,y)->x.compareTo(y)).forEach(x-> System.out.print(x));


    }


}
