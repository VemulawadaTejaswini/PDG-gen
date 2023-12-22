import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int datanum = sc.nextInt();
        LinkedList<Integer> ls = new LinkedList<>();
        for (int i = 0; i < datanum; i++)
            ls.add(sc.nextInt());
        List<Integer> ls2 = ls.parallelStream().map(e -> (int) Math.floor(e / 400.0)).collect(Collectors.toList());
        List<Integer> ls3 = ls2.stream().distinct().collect(Collectors.toList());
        int t = ls3.size();
        if (!ls3.contains(8))
            System.out.println(t + " " + t);
        else {
            t -= 1;
            int f = (int) ls2.stream().filter(e -> e.equals(8)).count();
            System.out.println(t + " " + (t + f));
        }
    }
}
