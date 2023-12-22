import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            int p = sc.nextInt();
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        for (int i = 1; i <= n; i++) System.out.println(map.getOrDefault(i, 0));
    }


}