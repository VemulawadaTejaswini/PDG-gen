import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.next());
        int M = Integer.parseInt(scanner.next());

        ArrayList<ArrayList<Integer>> nodes = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            nodes.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int Ai = Integer.parseInt(scanner.next()) - 1;
            int Bi = Integer.parseInt(scanner.next()) - 1;

            nodes.get(Ai).add(Bi);
            nodes.get(Bi).add(Ai);
        }
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < nodes.get(i).size(); j++) {
//                System.out.print(nodes.get(i).get(j));
//            }
//            System.out.println();
//        }

        int edgeCount = 0;

        for (int i = 0; i < N; i++) {
            ArrayList<Integer> firstNode = nodes.get(i);
            for (int j = 0; j < firstNode.size(); j++) {
                int secondNodeNum = firstNode.get(j);
                ArrayList<Integer> secondNode = nodes.get(secondNodeNum);
                for (int k = 0; k < secondNode.size(); k++) {
                    int thirdNodeNum = secondNode.get(k);
                    if (thirdNodeNum != i) {
                        ArrayList<Integer> thirdNode = nodes.get(thirdNodeNum);
                        for (int l = 0; l < thirdNode.size(); l++) {
                            int forthNodeNum = thirdNode.get(l);
                            if (forthNodeNum != i && forthNodeNum != secondNodeNum && forthNodeNum != thirdNodeNum) {
                                ArrayList<Integer> forthNode = nodes.get(forthNodeNum);
                                if (!forthNode.contains(i)) {
                                    edgeCount++;
                                    nodes.get(i).add(forthNodeNum);
                                    nodes.get(forthNodeNum).add(i);
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("edgeCount:" + edgeCount);

//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < nodes.get(i).size(); j++) {
//                System.out.print(nodes.get(i).get(j));
//            }
//            System.out.println();
//        }
    }
}