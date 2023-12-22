import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] sozai = s.nextLine().split(" ");
        int num = Integer.parseInt(sozai[0]);
        int ryou = Integer.parseInt(sozai[1]);
        List<Integer> sozaiZenbu = new ArrayList<Integer>();
        for(int i = 0;i < num;i++) {
            int hituyou = Integer.parseInt(s.nextLine());
            ryou -= hituyou;
            sozaiZenbu.add(hituyou);
        }
        int min = Collections.min(sozaiZenbu);
        num += ryou/min;
        System.out.println(num);
    }
}