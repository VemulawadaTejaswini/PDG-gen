import java.util.*;

public class Main {
    static int[][] dir = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        boolean[][] a = new boolean[h+2][w+2];
        ArrayDeque<Integer[]> que1 = new ArrayDeque<Integer[]>(500);
        ArrayDeque<Integer[]> que2 = new ArrayDeque<Integer[]>(500);
        for(int i=0; i<h; i++){
            String s = sc.next();
            for(int j=0; j<w; j++){
                if(s.charAt(j) == '#'){
                    a[i+1][j+1] = true;
                    que1.add(new Integer[]{i+1, j+1});
                }else{
                    a[i+1][j+1] = false;
                }
            }
        }
        sc.close();

        for(int i=0; i<h+2; i++){
            a[i][0] = true;
            a[i][w+1] = true;
        }
        for(int i=0; i<w+2; i++){
            a[0][i] = true;
            a[h+1][i] = true;
        }
        
        if(que1.size() == h*w){
            System.out.println(0);
            return;
        }

        int count = 0;
        while(true){
            if(count % 2 == 0){
                if(que1.size()== 0){
                    break;
                }
                while(que1.size() != 0){
                    Integer[] next = que1.pollLast();
                    for(int i=0; i<4; i++){
                        int nx = next[0] + dir[i][0];
                        int ny = next[1] + dir[i][1];
                        if(!a[nx][ny]){
                            a[nx][ny] = true;
                            que2.add(new Integer[]{nx, ny});
                        }
                    }
                }
            }else{
                if(que2.size()== 0){
                    break;
                }
                while(que2.size() != 0){
                    Integer[] next = que2.pollLast();
                    for(int i=0; i<4; i++){
                        int nx = next[0] + dir[i][0];
                        int ny = next[1] + dir[i][1];
                        if(!a[nx][ny]){
                            a[nx][ny] = true;
                            que1.add(new Integer[]{nx, ny});
                        }
                    }
                }
            }
            count++;
            if(count > 2500) break;
        }
        System.out.println(count-1);
    }
}