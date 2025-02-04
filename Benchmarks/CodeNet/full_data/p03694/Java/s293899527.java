import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        LinkedList<Integer> ls = new LinkedList<>();
        for(int i = 0;i < num;i++)
            ls.add(sc.nextInt());
        int max = ls.stream().max(Comparator.naturalOrder()).get();
        int min = ls.stream().min(Comparator.naturalOrder()).get();
        System.out.println(max - min);
    }
}