class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		boolean flg = true;
		int[] score = new int[3];						
		String grade = "";
		while(flg) {
			String[] str = br.readLine().split(" ");	
			score[0] = Integer.parseInt(str[0]);
			score[1] = Integer.parseInt(str[1]);
			score[2] = Integer.parseInt(str[2]);
			if(score[0]==-1 && score[1]==-1 && score[2]==-1) {
				break;
			}
			if(score[0] == -1 || score[1] == -1) {
				grade = grade + "F" + "\n";
			}
			else if(80 <= score[0]+score[1]) {
				grade = grade + "A" + "\n";
			}
			else if(score[0]+score[1] < 80 && 65 <=score[0]+score[1]) {
				grade = grade + "B" + "\n";
			}
			else if(score[0]+score[1] < 65 && 50 <=score[0]+score[1]) {
				grade = grade + "C" + "\n";
			}
			else if(score[0]+score[1] < 50 && 30 <=score[0]+score[1]) {
				if(50 <= score[2]) {
					grade = grade + "C" + "\n";
				}
				else
					grade = grade + "D" + "\n";
			}
			else {
				grade = grade + "F" + "\n";
			}
		}
		System.out.print(grade);
	}
}
