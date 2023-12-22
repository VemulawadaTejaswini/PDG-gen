import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main
{
    private static int solve(Set<int[]> nodes, int rest, int pos)
    {
        /*
        System.out.println(
                String.format(
                        "pos=%d, rest=%d, nodes=%s",
                        pos,
                        rest,
                        Arrays.toString(nodes.stream()
                                .map(node -> String.format("(%d->%d)", node[0], node[1]))
                                .toArray())
                )
        );
         */

        if (rest == 0) {
            return 1;
        }

        if (nodes.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (int[] node : nodes) {
            if (node[0] == pos) {
                count += solve(
                        nodes.stream()
                                .filter(x -> x != node)
                                .collect(Collectors.toSet()),
                        rest - 1,
                        node[1]);
            }
            else if (node[1] == pos) {
                count += solve(nodes.stream()
                                .filter(x -> x != node)
                                .collect(Collectors.toSet()),
                        rest - 1,
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

        System.out.println(solve(xs, n - 1, 1));
    }
}

