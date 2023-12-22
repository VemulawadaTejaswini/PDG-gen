import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main
{
    private static int solve(Set<int[]> nodes, Set<Integer> vertexes, int pos)
    {
        /*
        System.out.println(
                String.format(
                        "pos=%d, vertexes=%s, nodes=%s",
                        pos,
                        Arrays.toString(vertexes.stream().toArray()),
                        Arrays.toString(nodes.stream()
                                .map(node -> String.format("(%d->%d)", node[0], node[1]))
                                .toArray())
                )
        );
         */

        if (vertexes.contains(pos)) {
            if (vertexes.size() == 1) {
                return 1;
            }
        }
        else {
            return 0;
        }

        int count = 0;
        for (int[] node : nodes) {
            if (node[0] == pos) {
                count += solve(nodes,
                        vertexes.stream()
                                .filter(x -> x != pos)
                                .collect(Collectors.toSet()),
                        node[1]);
            }
            else if (node[1] == pos) {
                count += solve(nodes,
                        vertexes.stream()
                                .filter(x -> x != pos)
                                .collect(Collectors.toSet()),
                        node[0]);
            }
        }

        return count;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Set<int[]> xs = new HashSet<>();
        for (int i = 0; i < m; i++) {
            int[] node = new int[2];
            node[0] = scanner.nextInt();
            node[1] = scanner.nextInt();
            xs.add(node);
        }

        Set<Integer> vertexes = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toSet());

        System.out.println(solve(xs, vertexes, 1));
    }
}

