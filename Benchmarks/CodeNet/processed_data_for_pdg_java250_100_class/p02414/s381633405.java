public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String first_line = input.readLine();
		String[] array_of_lo_col = first_line.split(" ");
		int low_n = Integer.parseInt(array_of_lo_col[0]);
		int column_or_row_m = Integer.parseInt(array_of_lo_col[1]);
		int column_l = Integer.parseInt(array_of_lo_col[2]);
		long[][] matrix_A = new long[low_n][column_or_row_m];
		long[][] matrix_B = new long[column_or_row_m][column_l];
		long[][] matrix_C = new long[low_n][column_l];
		for (int low_spot = 0; low_spot < low_n; low_spot++) {
			String elements_A = input.readLine();
			String[] array_elements_A = elements_A.split(" ");
			for (int column_spot = 0; column_spot < column_or_row_m; column_spot++) {
				long element_A = Long.parseLong(array_elements_A[column_spot]);
				matrix_A[low_spot][column_spot] = element_A;
			}
		}
		for (int low_spot = 0; low_spot < column_or_row_m; low_spot++) {
			String elements_B = input.readLine();
			String[] array_elements_B = elements_B.split(" ");
			for (int column_spot = 0; column_spot < column_l; column_spot++) {
				long element_B = Long.parseLong(array_elements_B[column_spot]);
				matrix_B[low_spot][column_spot] = element_B;
			}
		}
		long Ci = 0;
		for (int low_spot = 0; low_spot < low_n; low_spot++) {
			for (int column_spot = 0; column_spot < column_l; column_spot++) {
				for (int m_term = 0; m_term < column_or_row_m; m_term++) {
					Ci += matrix_A[low_spot][m_term] * matrix_B[m_term][column_spot];
				}
				matrix_C[low_spot][column_spot] = Ci;
				System.out.print(matrix_C[low_spot][column_spot]);
				int remove_blank_last=column_l-1;
				if(column_spot < remove_blank_last){
				System.out.print(" ");
				}
				Ci=0;
			}
			System.out.println("");
		}
	}
}
