public class Main{
	public static void main(String args[]) {
		String sentence = "";
		int shuffle_times = 0;
		int shuffle_number = 0;
		StringBuffer input_sentence = null;
		String out = "";
		StringBuffer out_all = new StringBuffer(out);
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			sentence = sc.next();
			if(sentence.equals("-"))
			break;
			input_sentence = new StringBuffer(sentence);
			shuffle_times = sc.nextInt();
			while (sc.hasNext()) {
				for (int i = 0; i < shuffle_times; i++) {
					shuffle_number = sc.nextInt();
					StringBuffer add_sentence = new StringBuffer(
							input_sentence.substring(0, (shuffle_number)));
					input_sentence = input_sentence.delete(0,(shuffle_number));
					input_sentence = add_sentence.insert(0, input_sentence);
				}
				out_all = out_all.append(input_sentence+"\n");
				break;
			}
		}
		System.out.print(out_all);
	}
}
