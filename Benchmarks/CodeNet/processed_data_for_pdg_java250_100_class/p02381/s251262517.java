public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String first_line = input.readLine();
			int student_num = Integer.parseInt(first_line);
			if (student_num == 0) {
				break;
			}
			String secound_lines = input.readLine();
			String[] score_arrays = secound_lines.split(" ");
			double score_sum = 0;
			for (int score_spot = 0; score_spot < score_arrays.length; score_spot++) {
				int score = Integer.parseInt(score_arrays[score_spot]);
				score_sum += score;
			}
			double average = score_sum / student_num;
			double sequence_a_square = 0;
			for (int sequence_spot = 0; sequence_spot < score_arrays.length; sequence_spot++) {
				double score = Double.parseDouble(score_arrays[sequence_spot]);
				sequence_a_square += Math.pow(score - average, 2);
			}
			double distributed_a_square = sequence_a_square / student_num;
			double square_a = Math.sqrt(distributed_a_square);
			System.out.println(square_a);
		}
	}
}
