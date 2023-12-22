import java.util.*;
import java.io.*;

public class Main {
    private static class Node {
        ArrayList<Node> children = new ArrayList<>();
        Node parent;
        int number;
        int count;

        Node(int number) {
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
        Stack<Node> stack = new Stack<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            stack.push(node);
            ArrayList<Integer> children = winAgainst[node.number];

            if (children == null) {
                continue;
            }

            for (int childTeamNum : children) {
                Node child = new Node(childTeamNum);
                queue.add(child);
                node.children.add(child);
                child.parent = node;
            }
        }

        while (!stack.isEmpty()) {
            Node node = stack.pop();

            if (node.children.size() == 0) {
                node.count = 1;
            } else {
                int max = node.children.size();

                for (Node child : node.children) {
                    if (child.count + 1 > max) {
                        max = child.count + 1;
                    }
                }

                node.count = max;
            }
        }

        int result = root.children.size();
        for (Node rootChild : root.children) {
            if (rootChild.count + 1 > result) {
                result = rootChild.count;
            }
        }

        System.out.println(result);
    }
}