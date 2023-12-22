import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();

        char[][] s = new char[h][w];
        for(int i=0; i<h; i++) {
            s[i] = sc.nextLine().toCharArray();
        }
        sc.close();

        // down, right, up, left
        int[] x = {1, 1, 0, -1, -1, -1, 0, 1}; //height
        int[] y = {0, 1, 1, 1, 0, -1, -1, -1}; //width
        char[][] ans = new char[h][w];

        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                int cnt = 0;
                for(int k=0; k<8; k++) {
                    int nx = i+x[k];
                    int ny = j+y[k];
                    if(nx >= 0 && nx < h && ny >= 0 && ny < w) {
                        if(s[nx][ny] == '#') {
                            cnt++;
                        }
                    }
                }
                if(s[i][j] == '#') {
                    ans[i][j] = '#';
                } else {
                    ans[i][j] = (char)(cnt+'0');
                }
            }
        }

        for(int i=0; i<h; i++) {
            System.out.println(ans[i]);
        }
    }
}
