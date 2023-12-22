import java.util.Scanner;

public class Main {

    static int N,A,B,C;
    static int[] list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String temp = sc.nextLine();

        String[] tempArr = temp.split(" ");
         N = Integer.parseInt(tempArr[0]);
         A = Integer.parseInt(tempArr[1]);
         B = Integer.parseInt(tempArr[2]);
         C = Integer.parseInt(tempArr[3]);

         list = new int[N];
         for (int i =0; i< N; i++) {
             list[i] = Integer.parseInt(sc.nextLine());
         }

        System.out.println(dfs(0,0,0,0));

    }

    public static int dfs(int depth,int length_a, int length_b, int length_c) {
        if (depth == N) {
            if (Math.min(length_a,Math.min(length_b,length_c)) > 0) {
                return Math.abs(length_a - A) + Math.abs(length_b - B) + Math.abs(length_c - C) - 30;
            } else {
                return 999999;
            }
        }
        int cost_a = dfs(depth + 1,length_a + list[depth],length_b,length_c) + 10;
        int cost_b = dfs(depth + 1,length_a,length_b + list[depth],length_c) + 10;
        int cost_c = dfs(depth + 1,length_a,length_b ,length_c + list[depth]) + 10;
        int cost_d = dfs(depth + 1,length_a,length_b,length_c);
        return Math.min(Math.min(cost_a,cost_b),Math.min(cost_c,cost_d));
    }

}