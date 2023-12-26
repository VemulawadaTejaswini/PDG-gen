public class Main{
	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		String answer = "";
		final int num = scan.nextInt();
		int len = scan.nextInt();
		String[] words = new String[num];
		for(int i = 0; i < num; i++){
			words[i] = scan.next();
		}
		for(int i = 1; i < num; i++){
			String temp = words[i];
			int j = i - 1;
			while(j >= 0 && words[j].compareTo(temp) > 0){
				words[j + 1] = words[j];
				j--;
			}
			words[j + 1] = temp;
		}
		for(int i = 0; i < num; i++){
			answer = answer.concat(words[i]);
		}
		System.out.println(answer);
	}
}
