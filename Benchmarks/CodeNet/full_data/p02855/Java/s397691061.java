import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        int[][] array = new int[r][c];
        
        int now = 1;
        for (int i = 0; i < r; i++) {
            String str = sc.next();
            for (int j = 0; j < c; j++) {
                if (str.charAt(j) == '.') {
                    array[i][j] = 0;
                } else {
                    array[i][j] = now;
                    now++;
                }
            }
        }
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (array[i][j] != 0) {
                    int p = array[i][j];
                    for (int k = j - 1; k >= 0; k--) {
                        if (array[i][k] == 0) {
                            array[i][k] = p;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        
        for (int i = r - 1; i >= 0; i--) {
            for (int j = c - 1; j >= 0; j--) {
                if (array[i][j] != 0) {
                    int q = array[i][j];
                    for (int k = j + 1; k < c; k++) {
                        array[i][k] = q;
                    }
                    break;
                }
            }
        }
        
        for (int i = r - 1; i >= 0; i--) {
            if (i != r - 1 && array[i][0] == 0) {
                for (int j = 0; j < c; j++) {
                    array[i][j] = array[i + 1][j];
                }
            }
        }

        for (int i = 0; i < r; i++) {
            if (i != 0 && array[i][0] == 0) {
                for (int j = 0; j < c; j++) {
                    array[i][j] = array[i - 1][j];
                }
            }
        }        
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(array[i][j]);
                if (j != c - 1) {
                    
                System.out.print(" ");
                }
            }
            if (i != r - 1) {
            System.out.println();
            }
        }
    }
}
