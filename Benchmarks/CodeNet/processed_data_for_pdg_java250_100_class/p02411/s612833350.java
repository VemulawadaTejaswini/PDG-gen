public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String[] tmpArray = br.readLine().split(" ");
			int m = Integer.parseInt(tmpArray[0]);
			int f = Integer.parseInt(tmpArray[1]);
			int r = Integer.parseInt(tmpArray[2]);
			if(m == -1 && f == -1 && r == -1){
				break;
			}
			String grade;
			if(m == -1 || f == -1){
				grade ="F";
			}
			else {
				int sum = m + f;
				if(sum >= 80){
					grade = "A";
				}
				else if(sum >= 65){
					grade = "B";
				}
				else if(sum >= 50){
					grade = "C";
				}
				else if(sum >= 30){
					grade = "D";
					if(r >= 50){
						grade = "C";
					}
				}
				else{
					grade = "F";
				}
			}
			System.out.println(grade);
		}
	}
}
