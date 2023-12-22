
public class Count_Balls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 数字の入力
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = A+B;
        // Nを指定した場合のあまり
        int L = N%C;
        // 計算用
        int target= A*(N/C) + Integer.min(L, A);
        // 出力
        System.out.println(target);
    }
}