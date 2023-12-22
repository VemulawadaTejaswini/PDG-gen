import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        char[][] field = new char[h][w];
        int [][] numStep = new int[h][w];
        numStep[0][0] = 1;
        
        int numDot = 0;
        for (int i = 0; i < h; i++) {
            String line = sc.next();
            for (int j = 0; j < w; j++) {
                field[i][j] = line.charAt(j);
                numDot += (line.charAt(j) == '.') ? 1 : 0;
            }
        }
        
        Queue<Integer> qI = new ArrayDeque<>();
        Queue<Integer> qJ = new ArrayDeque<>();
        qI.add(0);
        qJ.add(0);

        int[] moveI = new int[]{1, 0, -1, 0};
        int[] moveJ = new int[]{0, 1, 0, -1};
        
        while (!qI.isEmpty()) {
            int i = qI.poll();
            int j = qJ.poll();
            
            for (int k = 0; k < 4; k++) {
                int nextI = i + moveI[k];
                int nextJ = j + moveJ[k];
                
                if (nextI >= 0 && nextI < h && nextJ >= 0 && nextJ < w &&
                        numStep[nextI][nextJ] == 0 &&
                        field[nextI][nextJ] == '.') {
                    numStep[nextI][nextJ] = numStep[i][j] + 1;
                    qI.add(nextI);
                    qJ.add(nextJ);
                }
            }
        }
        
        if (numStep[h-1][w-1] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(numDot - numStep[h-1][w-1]);
        }
    }
}