import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] condstr = in.nextLine().split(" ");
        int num = Integer.parseInt(condstr[0]);
        int dim = Integer.parseInt(condstr[1]);
        int[][] point = new int[num][dim];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < dim; j++) {
                point[i][j] = Integer.parseInt(in.next());
            }
        }
        in.close();
        int count = 0;
        for (int i = 0; i < num - 1; i++) {
            for (int j = 1 + i; j < num; j++) {
                int distsq = 0;
                for (int k = 0; k < dim; k++) {
                    distsq += Math.pow((point[i][k] - point[j][k]), 2);
                }
                double dist = Math.sqrt(distsq);
                int distint = 0;
                distint += Math.pow((int) (dist), 2);
                if (distint == distsq) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
