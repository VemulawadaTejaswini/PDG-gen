import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n_even = Integer.parseInt(sc.next()); // 偶数が書かれている
        int m_odd = Integer.parseInt(sc.next()); // 奇数が書かれている
        // 偶数同士または奇数同士の和が偶数になる
        int n_even_count = (n_even * (n_even - 1)) / 2;
        int m_odd_count = (m_odd * (m_odd - 1)) / 2;
        int answer = n_even_count + m_odd_count;
        System.out.println(answer);
        sc.close();
    }
}