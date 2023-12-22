import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int x = sc.nextInt();
        char[][] array = new char[y][x];
        int[] dy = {-1,-1,-1,0,0,1,1,1};
        int[] dx = {-1,0,1,-1,1,-1,0,1};
        for(int i = 0; i<y; i++) {
            String s = sc.next();
            for(int j=0; j<x; j++) {
                array[i][j] = s.charAt(j);
            }
        }
        for(int i = 0; i<y; i++) {
            for(int j=0; j<x; j++) {
                if(array[i][j]=='#') continue;
                int count = 0;
                for(int k=0; k<8; k++) {
                    int ni = i + dy[k];
                    int nj = j + dx[k];
                    if(ni <0 || y<=ni) continue;
                    if(nj <0 || x<=nj) continue;
                    if(array[ni][nj]=='#') count++;
                }
                array[i][j] = (char) (count + '0');
            }
        }
        for(int i = 0; i<y; i++) {
            for(int j=0; j<x; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}