import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();

		int m_i = 0;
		int m_g = 0;
		int m_min = 1000;

		while (m_g <= X && m_i < N) {

			int m = sc.nextInt();

			m_g = m_g + m;

			if (m < m_min) {
				m_min = m;
			}

			m_i++;

		}

		if (m_g < X) {

			int n = (X - m_g) / m_min;
			System.out.println(m_i + n);

		} else {
			System.out.println(m_i);
		}

		sc.close();
		// System.out.println(N + "," + X);

	}
}
