import java.util.*;
import java.io.*;

public class Main {
    private static class Node {
        ArrayList<Node> children = new ArrayList<>();
        int number;

        public Node(int number) {
            this.number = number;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        // Scanner sc = new Scanner(new FileReader("input.txt"));

        int teamNum = sc.nextInt();
        ArrayList<Integer>[] winAgainst = new ArrayList[teamNum + 1]; // idxがチームナンバーに対応

        for (int i = 0; i < teamNum - 1; i++) {
            int loseTeam = i + 2;
            int winTeam = sc.nextInt();

            if (winAgainst[winTeam] == null) {
                winAgainst[winTeam] = new ArrayList<>();
            }

            winAgainst[winTeam].add(loseTeam);
        }

        Queue<Node> queue = new LinkedList<>();

        Node root = new Node(1);
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            ArrayList<Integer> children = winAgainst[node.number];

            if (children == null) {
                continue;
            }

            for (int childTeamNum : children) {
                Node child = new Node(childTeamNum);
                queue.add(child);
                node.children.add(child);
            }
        }

        System.out.println(count(root));
    }

    public static int count(Node root) {
        int max = root.children.size();

        if (max == 0) {
            return 0;
        }

        for (Node child : root.children) {
            int sumValue = count(child) + 1;
            if (sumValue > max) {
                max = sumValue;
            }
        }

        return max;
    }
}