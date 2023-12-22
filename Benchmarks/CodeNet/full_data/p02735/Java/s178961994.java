import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        char[][] chars = new char[h][w];
        for (int i = 0; i < h; i++) {
            String p = scan.next();
            for (int j = 0; j < p.length(); j++) {
                chars[i][j] = p.charAt(j);
            }
        }
        System.out.println(dfs(chars,0,0,h,w));
    }

    private static int dfs(char[][] chars, int i, int j, int h, int w) {
        if(i == h-1 && j == w-1) return chars[i][j] == '#'?1:0;
        if(i >= h || j >= w) return h+w;
        return (chars[i][j] == '#'?1:0) + Math.min(dfs(chars,i+1,j,h,w),dfs(chars,i,j+1,h,w));
    }
}
