import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		final long K = sc.nextLong();
		double k_10 = Math.log10(K);
		final long five_1000_tri = 5000000000000000L;
		int[] s_tmp = new int[s.length()];
		double[] s_tmp_5000tri = new double[s.length()];

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            try {
                s_tmp[i] = Character.getNumericValue(ch);
            } catch(NumberFormatException e) {
                System.out.println("数字の形式が正しくありません。");
            }
            s_tmp_5000tri[i] = Math.log10(s_tmp[i]) * five_1000_tri;
        }
        long num = 0L;
        for (int i = 0; i < s_tmp_5000tri.length; i++) {
        	num += s_tmp_5000tri[i];
        	if (num >= k_10) {
				System.out.println(s_tmp[i]);
				return;
			}
		}
	}
}