import java.util.Scanner;

public class Main {
    //Brick Break
    //每次 C 都做不出几道, 吃力的不行, 带下标的题目描述看不懂, 那 D 更做不出来了?
    //像是在求最长递增子集?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) A[i] = sc.nextInt();
        System.out.println(helper(A, n));
        sc.close();
    }

    static int helper(int[] A, int n) {
        int index = 0, count = 0, number = 1;
        boolean flag = false;
        while (index < n) {
            if (A[index] == number) {
                flag = true;
                count++;
                number++;
            }
            index++;
        }
        if (flag) return n - count;
        else return -1;
    }
}
