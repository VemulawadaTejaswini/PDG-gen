import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    private static boolean solve(boolean player, Boolean[] vertices, Map<Integer, List<Integer>> nodes)
    {
        boolean put = false;
        for (int i = 0; i < vertices.length; i++) {
            Boolean v = vertices[i];
            if (v == null) {
                continue;
            }

            if ((player && v) || (!player && !v)) {
                List<Integer> dstList = nodes.get(i);
                if (dstList == null) {
                    continue;
                }
                for (int dst : dstList) {
                    if (vertices[dst] == null) {
                        Boolean[] newVertices = Arrays.copyOf(vertices, vertices.length);
                        newVertices[dst] = player;
                        if (!solve(!player, newVertices, nodes)) {
                            put = true;
                        }
                    }
                }
            }
        }
        return put;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, List<Integer>> nodes = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            nodes.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
            nodes.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
        }
        Boolean[] vertices = new Boolean[n + 1];
        vertices[1] = true;
        vertices[n] = false;
        if (solve(true, vertices, nodes)) {
            System.out.println("Fennec");
        }
        else {
            System.out.println("Snuke");
        }
    }
}

