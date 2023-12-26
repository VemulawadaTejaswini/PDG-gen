public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String first_line = input.readLine();
		String[] array_of_li_col = first_line.split(" ");
		int line = Integer.parseInt(array_of_li_col[0]);
		int column = Integer.parseInt(array_of_li_col[1]);
		int matrix_array_A[][] = new int[line][column];
		int vector_array_b[] = new int[column];
		for (int line_A = 0; line_A < line; line_A++) {
			String elements_A = input.readLine();
			String[] elements_A_array = elements_A.split(" ");
			for (int column_A = 0; column_A < column; column_A++) {
				int elements_A_num = Integer.parseInt(elements_A_array[column_A]);
				matrix_array_A[line_A][column_A] = elements_A_num;
			}
		}
		for (int column_b = 0; column_b < column; column_b++) {
			String elements_b = input.readLine();
			int elements_b_num = Integer.parseInt(elements_b);
			vector_array_b[column_b] = elements_b_num;
		}
		int elements_Ci = 0;
		for (int line_A = 0; line_A < line; line_A++) {
			for (int column_A = 0; column_A < column; column_A++) {
				elements_Ci += matrix_array_A[line_A][column_A] * vector_array_b[column_A];
			}
			System.out.println(elements_Ci);
			elements_Ci = 0;
		}
	}
}
